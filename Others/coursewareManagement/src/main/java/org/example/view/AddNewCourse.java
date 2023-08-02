package org.example.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.example.entity.CourseEntity;
import org.example.factory.MySessionFactory;
import org.example.model.Course;
import org.hibernate.Session;

public class AddNewCourse extends HttpServlet {
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
		
		Course course = (Course) request.getAttribute("COURSE");
		CourseEntity entity = new CourseEntity(course.getCourseName(), course.getCoursePrice());
		
		try
		{
			Session session = MySessionFactory.getSession();
			session.getTransaction().begin();
			session.save(entity);
			session.getTransaction().commit();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		out.println("New Course Added Successfully....");
		//out.println("Redirecting to admin homepage.");
		
		out.println("<br/><br/><a href = 'addCourse.html'>Add Another Course</a>");
		out.println("<br/><a href = 'display.view'>Display All Courses</a>");
		out.println("<br/><a href = 'index.html'>Homepage</a>");
		
	}
}
