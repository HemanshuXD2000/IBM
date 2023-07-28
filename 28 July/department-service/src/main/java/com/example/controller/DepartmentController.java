package com.example.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Department;
import com.example.service.DepartmentService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	private final DepartmentService departmentService;
	private final Environment environment;
	
	@GetMapping("/status")
	public String status()
	{
		return "Department-Service is up and running on port "+environment.getProperty("local.server.port");
	}
	
	@GetMapping("/{departmentName}")
	public Department findByName(@PathVariable("departmentName") String departmentName)
	{
		return departmentService.findDepartmentByName(departmentName);
	}
}
