package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.exception.EmployeeNotFoundException;
import com.example.model.Employee;
import com.example.repo.EmployeeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

	private final EmployeeRepository employeeRepository;
	
		
	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> listEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(int employeeId) {
		Optional<Employee> emp = employeeRepository.findById(employeeId);
		if(emp == null)
		{
			return null;
		}
		else
		{
			return emp;
		}
	}

	@Override
	public Employee updateEmployeeById(Employee employee) {
		Optional<Employee> emp = employeeRepository.findById(employee.getEmployeeId());
		
		if(emp.isEmpty())
		{
			return null;
		}
		else
		{
			emp.get().setFirstName(employee.getFirstName());
			emp.get().setLastName(employee.getLastName());
			emp.get().setSalary(employee.getSalary());
			
			employeeRepository.save(emp.get());
			
			return emp.get();
		}
	}

	@Override
	public void deleteEmployee(int employeeId) {
		Optional<Employee> emp = employeeRepository.findById(employeeId);
		
		if(!emp.isEmpty())
		{			
			employeeRepository.deleteById(employeeId);
		}
		else
		{
			throw new EmployeeNotFoundException("Employee with ID: "+employeeId+" not found...");
		}
	}
	
	

	
}
