package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Customer;

public interface CustomerService {

	Customer createCustomer(Customer customer);
	
	List<Customer> getAllCustomers();
	
	Optional<Customer> getCustomerById(int customerId);
	
	Customer updateCustomerById(Customer customer);
	
	void deleteCustomerById(int customerId);
}
