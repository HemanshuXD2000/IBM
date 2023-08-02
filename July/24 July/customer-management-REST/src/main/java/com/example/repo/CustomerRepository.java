package com.example.repo;

import java.util.Collection;
import com.example.model.Customer;

public interface CustomerRepository {

	Customer createCustomer(Customer customer);
	
	Collection<Customer> getAllCustomers();
	
	Customer getCustomerById(String customerId);
	
	Customer updateCustomerById(String customerId, Customer customer);
	
	String deleteCustomerById(String customerId);
}
