package com.example.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.model.Employee;
import com.example.repo.EmployeeRepository;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class SpringConfig implements CommandLineRunner {
	
	private final EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("John","Doe",10000));
		employees.add(new Employee("Tony","Starks",75000));
		employees.add(new Employee("Pepper","Potts",95000));
		employeeRepository.saveAll(employees);
	}
}
