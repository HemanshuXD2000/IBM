package org.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.example.entity.CourseEntity;
import org.example.factory.MySessionFactory;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class DisplayCourse extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			Session session = MySessionFactory.getSession();
			session.getTransaction().begin();
			String sql = "FROM CourseEntity";

			Query<CourseEntity> query = session.createQuery(sql, CourseEntity.class);
			List<CourseEntity> courses = query.list();

			request.setAttribute("ALLCOURSE", courses);

			out.println("<html>");
			out.println("<head>");
			out.println("<title>Course List</title>");
			out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">");
			
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Course List</h1>");
			out.println("<table class = table table-striped w-auto");
			out.println("<tr>");
			out.println("<thead class='thead-dark'>");
			out.println("<th scope = 'col'>ID</th>");
			out.println("<th scope = 'col'>Name</th>");
			out.println("<th scope = 'col'>Price</th>");
			out.println("</tr>");
			out.println("</thead>");
			for (CourseEntity course : courses) {
				out.println("<tr>");
				out.println("<td>" + course.getId() + "</td>");
				out.println("<td>" + course.getCourse_name() + "</td>");
				out.println("<td>" + course.getCourse_price() + "</td>");
				out.println("</tr>");
			}
			// request.getRequestDispatcher("displayCourse.html").forward(request,
			// response);
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
			out.println("</br></br><a href = 'index.html'>Homepage</a>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
