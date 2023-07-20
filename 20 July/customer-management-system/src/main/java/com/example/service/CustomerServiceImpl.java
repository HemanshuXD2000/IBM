package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dao.CustomerDao;
import com.example.model.Customer;

import lombok.Data;

@Data
@Service
public class CustomerServiceImpl implements CustomerService {

	public final CustomerDao customerDao;
	
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomers();
	}

	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.saveCustomer(customer);	
	}

}
