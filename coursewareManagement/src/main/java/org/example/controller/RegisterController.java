package org.example.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.example.entity.CourseEntity;
import org.example.entity.Student;
import org.example.factory.MySessionFactory;
import org.hibernate.Session;


public class RegisterController extends HttpServlet {
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
		
		//int courseId = Integer.parseInt(request.getParameter("courseId"));
		String studentName = request.getParameter("s_name");
		String courseName = request.getParameter("c_name");
		try 
		{
			Session session = MySessionFactory.getSession();

			
			Query query = session.createQuery("FROM CourseEntity where course_name =: courseName");
			query.setParameter("courseName", courseName);
			CourseEntity courseEntity = (CourseEntity) query.getSingleResult();
			//out.println(courseEntity);
			
			if(courseEntity !=null)
			{
				Student student = new Student();
				student.setStudent_name(studentName);
				student.setCourse_name(courseName);
				session.beginTransaction();
				session.save(student);
				session.getTransaction().commit();
				
				out.println("Student <h2>"+studentName+ "</h2> added for the course: <h2>"+courseName+"</h2>");
				out.println("<a href = 'index.html'><br/>Homepage</a>");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			out.println("<h3><font color = 'red'>course not found....</font></h3>");
			out.println("<a href = 'index.html'><br/>Homepage</a>");
		}
		
	}
}