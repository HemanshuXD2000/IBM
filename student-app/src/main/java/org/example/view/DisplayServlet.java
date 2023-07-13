package org.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.example.model.Student;

public class DisplayServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		//Map<String, Double> sampleData = new HashMap<>();
		List<Student> sampleData = new ArrayList<>();
		
		sampleData.add(new Student("John Doe", 80.26));
		sampleData.add(new Student("Marry Public", 72.60));
		sampleData.add(new Student("Tony Stark", 98.02));
		sampleData.add(new Student("John Doe", 80.26));
		
		out.println("<html>");
		out.println("<head><title>Student Data</title></head>");
		out.println("<body>");
		out.println("<h1>Student Data<h1>");
		out.println("<table border=1>");
	    out.println("<tr><th>Name</th><th>Grade</th></tr>");
	    
	    for(Student s : sampleData)
	    {
	    	out.println("<tr>");
	    	out.println("<td>"+s.getName()+"</td>");
	    	out.println("<td>"+s.getGrade()+"</td>");
	    	out.println("</tr>");
	    }
	    out.println("</table>");
	    out.println("</body>");
	    out.println("</html>");
	}
}
