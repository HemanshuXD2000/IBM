package com.example.service;

import java.util.Collection;

import com.example.model.Customer;

public interface CustomerService {

	Customer createCustomer(Customer customer);

	Collection<Customer> getAllCustomers();

	Customer getCustomerById(String customerId);

	Customer updateCustomerById(String customerId, Customer customer);

	String deleteCustomerById(String customerId);
}
