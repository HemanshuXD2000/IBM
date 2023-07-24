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

	private final Map<String, Customer> customers;
	
	{
		customers = new  HashMap<String, Customer>();
	}
	
	@Override
	public Customer createCustomer(Customer customer) 
	{
		customers.put(customer.getCustomerId(), customer);
		return customer;
		
	}

	@Override
	public Collection<Customer> getAllCustomers() 
	{
		Collection<Customer> collection = customers.values();
		return collection;
	}

	@Override
	public Customer getCustomerById(String customerId) {
		Customer customer = customers.get(customerId);
		if(customer == null)
		{
			return null;			
		}
		else
		{
			return customer;
		}
	}

	@Override
	public Customer updateCustomerById(String customerId, Customer customer) {
		Customer tempCustomer = customers.get(customerId);
		if(customer == null)
		{
			return null;			
		}
		else
		{
			tempCustomer.setFirstName(customer.getFirstName());
			tempCustomer.setLastName(customer.getLastName());
			tempCustomer.setEmail(customer.getEmail());
			return tempCustomer;
		}
	}

	@Override
	public String deleteCustomerById(String customerId) {
		Customer customer = customers.get(customerId);
		if(customer != null) 
		{
			customers.remove(customerId);
			return "customer deleted...";
		}
		else
		{
			return "customer not found...";
		}
	}

}
