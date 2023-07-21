package com.example.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping
	 public String showDate(Model theModel) 
	 {
	 theModel.addAttribute("theDate", new Date());
	 return "hello-world";
	 }
}
