package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.exception.CustomerNotFoundException;
import com.example.model.Customer;
import com.example.repo.CustomerRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
	
	private final CustomerRepository customerRepository;

	@Override
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Optional<Customer> getCustomerById(int customerId) {
		Optional<Customer> cust = customerRepository.findById(customerId);
		if(cust == null)
		{
			return null;
		}
		else
		{
			return cust;
		}
	}

	@Override
	public Customer updateCustomerById(Customer customer) {
		Optional<Customer> cust = customerRepository.findById(customer.getCustomerId());
		
		if(cust.isEmpty())
		{
			return null;
		}
		else
		{
			cust.get().setFirstName(customer.getFirstName());
			cust.get().setLastName(customer.getLastName());
			cust.get().setEmail(customer.getEmail());
			
			customerRepository.save(cust.get());
			
			return cust.get();
		}
	}

	@Override
	public void deleteCustomerById(int customerId) {
		Optional<Customer> cust = customerRepository.findById(customerId);
		
		if(!cust.isEmpty())
		{
			customerRepository.deleteById(customerId);
		}
		else
		{
			throw new CustomerNotFoundException("Customer with ID: "+customerId+" not found....");
		}
		
	}

}
