package com.example.service;

import java.util.List;

import com.example.model.Customer;

public interface CustomerService {

	public List<Customer> getAllCustomers();
	public void saveCustomer(Customer customer);
	public Customer findCustomerById(int customerId);
	public Customer updateCustomer(Customer theCustomer);
	public void deleteCustomer(int customerId);
}
