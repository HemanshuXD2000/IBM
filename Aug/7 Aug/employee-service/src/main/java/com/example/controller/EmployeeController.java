package com.example.controller;

import java.util.List;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.client.DepartmentClient;
import com.example.exception.DeptNotFoundException;
import com.example.model.EmployeeEntity;
import com.example.model.Tutorial;
import com.example.service.EmployeeService;
import com.example.ui.DepartmentDto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/employees")
public class EmployeeController {

	private final EmployeeService employeeService;
	private final Environment environment;
	private final DepartmentClient departmentClient;
	
	@GetMapping("/status")
	public ResponseEntity<?> status()
	{
		return ResponseEntity.ok("Emplotyee Service is up and running on port: " +environment.getProperty("local.server.port"));
	}
	
//	@PostMapping("/{departmentName}")
//	public ResponseEntity<?> createEmployee(@RequestBody EmployeeEntity employee,@PathVariable String departmentName) throws DeptNotFoundException {
//
//		ResponseEntity<DepartmentDto> o = restTemplate.getForEntity("http://localhost:9999/DEPARTMENT-SERVICE/departments/" + departmentName,
//				DepartmentDto.class);
//
//		DepartmentDto dto = o.getBody();
//		if(dto == null)
//		{
//			throw new DeptNotFoundException("Department named '"+departmentName+"' not found...");
//		}
//		else {			
//			employee.setDepartmentId(dto.getDepartmentId());
//			employee.setDepartmentName(dto.getDepartmentName());
//			return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.createEmployee(employee));
//		}
//	}
	
	@PostMapping()
	public ResponseEntity<?> createEmployee(@RequestBody EmployeeEntity employee) throws DeptNotFoundException
	{
		String departmentName = employee.getDepartmentName();
		DepartmentDto dto = departmentClient.getDepartmentByName(departmentName);
		if(dto==null)
		{
			throw new DeptNotFoundException("Department name '"+departmentName+"' not found...");
		}
		else
		{
			employee.setDepartmentId(dto.getDepartmentId());
			employee.setDepartmentName(dto.getDepartmentName());
			return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.createEmployee(employee));
		}
	}
	
	@GetMapping
	public List<EmployeeEntity> getAllEmployee()
	{
		return employeeService.getAllEmployee();
	}
	
}
