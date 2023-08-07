package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.model.Department;
import com.example.repo.DepartmentRepository;

import lombok.AllArgsConstructor;

@SpringBootApplication
@EnableDiscoveryClient
@AllArgsConstructor
public class DepartmentServiceApplication implements CommandLineRunner {

	private final DepartmentRepository departmentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		departmentRepository.save(new Department("Sales","Hyderabad"));
		departmentRepository.save(new Department("IT","Bangalore"));
		departmentRepository.save(new Department("Operations","Melbourne"));
	}

}
