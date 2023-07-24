package com.example.repo;

import java.util.Collection;
import com.example.model.Customer;

public interface CustomerRepository {

	Customer createCustomer(Customer customer);
	
	Collection<Customer> getAllCustomers();
}
