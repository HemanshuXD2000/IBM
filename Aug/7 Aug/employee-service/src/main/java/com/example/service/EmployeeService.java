package com.example.service;

import java.util.List;

import com.example.model.EmployeeEntity;

public interface EmployeeService {
	
	EmployeeEntity createEmployee(EmployeeEntity employee);
	
	List<EmployeeEntity> getAllEmployee();
	
}
