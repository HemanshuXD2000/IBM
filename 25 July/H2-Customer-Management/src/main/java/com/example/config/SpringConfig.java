package com.example.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.model.Customer;
import com.example.repo.CustomerRepository;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class SpringConfig implements CommandLineRunner {

	private final CustomerRepository customerRepository;
	
	@Override
	public void run(String... args) throws Exception {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("Natasha","Romanoff","romNatasha@starks.inc"));
		customers.add(new Customer("Tony","Stark","tony@starks.inc"));
		customers.add(new Customer("Pepper","Potts","ppotts@starks.inc"));
		
		customerRepository.saveAll(customers);
		
	}
	
}
