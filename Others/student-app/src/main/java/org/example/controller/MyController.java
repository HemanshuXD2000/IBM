package org.example.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.example.model.Student;

public class MyController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		List<String> errors = new ArrayList<String>();
		
		response.setContentType("text/html");
		
		String name = request.getParameter("s1");
		if(name.length()<=0)
		{
			errors.add("Name field cannot be blank...");
		}
		
		Double grade = 0.0;
		try {
			grade = Double.parseDouble(request.getParameter("s2"));
		}catch (Exception e) {
			// TODO: handle exception
			errors.add("Grade field cannot be blank..");
		}
//		if(grade != null) {
//			errors.add("Grade field cannot be blank..");
//		}
		if(!errors.isEmpty())
		{
			request.setAttribute("ERROR", errors);
			RequestDispatcher view = request.getRequestDispatcher("error.view");
			view.forward(request, response);
		}
		else
		{
			Student student = new Student(name,grade);
			
			request.setAttribute("STUD", student);
			RequestDispatcher view = request.getRequestDispatcher("success.view");
			view.forward(request, response);
		}
	}

}
