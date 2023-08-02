package org.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Errors extends HttpServlet {
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
		
		@SuppressWarnings("unchecked")
		List<String> list = (List<String>) request.getAttribute("ERROR");
		if(list!= null)
		{
			out.println("<ul>Please Correct the below error(s)</ul><br/>");
			for(String s : list)
			{
				out.println("<font color = 'RED'><li>" +s+ "</li></font><br/>");
			}
		}
	}

}
