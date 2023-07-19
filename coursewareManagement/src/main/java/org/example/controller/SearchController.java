package org.example.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.example.entity.CourseEntity;
import org.example.factory.MySessionFactory;
import org.hibernate.Session;

public class SearchController extends HttpServlet {
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
		
		String courseName = request.getParameter("c_name");
		try 
		{
			Session session = MySessionFactory.getSession();

			
			Query query = session.createQuery("FROM CourseEntity where course_name =: courseName");
			query.setParameter("courseName", courseName);
			CourseEntity courseEntity = (CourseEntity) query.getSingleResult();
			out.println(courseEntity);
			out.println("<a href = 'index.html'><br/>Homepage</a>");
			
	}
		catch (Exception e) 
		{
			out.println("<h3><font color = 'red'>course not found....</font></h3>");
			out.println("<a href = 'index.html'><br/>Homepage</a>");
		}

}
}
