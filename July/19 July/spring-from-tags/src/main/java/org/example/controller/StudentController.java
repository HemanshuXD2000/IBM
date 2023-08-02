package org.example.controller;

import org.example.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		Student theStudent = new Student();
		theModel.addAttribute("student", theStudent);
		return "showForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent)
	{
		//System.out.println("theStudent: " +theStudent.getFirstName()+ " " +theStudent.getLastName());
		return "success";
	}
}
