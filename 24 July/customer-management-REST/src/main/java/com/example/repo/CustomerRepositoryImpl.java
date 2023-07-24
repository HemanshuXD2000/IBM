package com.example.repo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import com.example.model.Customer;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

	private final Map<Integer, Customer> customers;
	
	{
		customers = new  HashMap<Integer, Customer>();
	}
	
	@Override
	public Customer createCustomer(Customer customer) 
	{
		customers.put(new Random().nextInt(1000), customer);
		return customer;
		
	}

	@Override
	public Collection<Customer> getAllCustomers() 
	{
		Collection<Customer> collection = customers.values();
		return collection;
	}

}
