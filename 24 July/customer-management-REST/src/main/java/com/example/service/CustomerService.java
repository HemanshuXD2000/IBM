package com.example.service;

import java.util.Collection;

import com.example.model.Customer;

public interface CustomerService {

Customer createCustomer(Customer customer);
	
	Collection<Customer> getAllCustomers();
}
