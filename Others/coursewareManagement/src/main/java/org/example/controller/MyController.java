package org.example.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.example.model.Course;

public class MyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//Random random = new Random();
		//int id = random.nextInt(1000);
		String courseName = null;
		Double coursePrice = 0.0;
		List<String> errors = new ArrayList<>();
		
		courseName = request.getParameter("c_name");
		if(courseName.length() <= 0) {
			errors.add("Enter valid course name.");
		}

		try {
			coursePrice = Double.parseDouble(request.getParameter("c_price"));
		}
		catch(Exception e) {
			errors.add("Enter valid course price..");
		}
		
		if(!errors.isEmpty())
		{
			request.setAttribute("ERROR", errors);
			RequestDispatcher view = request.getRequestDispatcher("error.view");
			view.forward(request, response);
		}
		else {
			request.setAttribute("COURSE", new Course(courseName, coursePrice));
			RequestDispatcher view = request.getRequestDispatcher("success.view");
			view.forward(request, response);
		}
	}
}
