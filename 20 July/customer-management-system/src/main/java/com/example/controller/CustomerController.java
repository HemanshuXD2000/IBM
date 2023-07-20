package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@GetMapping("/list")
	public String listCustomer(Model theModel)
	{
		Customer cust1 = new Customer(1,"John","Doe","johndoe@shop.com");
		Customer cust2 = new Customer(2,"Marry","Public","marry@shop.com");
		Customer cust3 = new Customer(3,"Smith","Jones","jsmith@shop.com");
		
		List<Customer> theCustomers = new ArrayList<>();
		
		theCustomers.add(cust1);
		theCustomers.add(cust2);
		theCustomers.add(cust3);
		
		theModel.addAttribute("customers", theCustomers);
		return "customerList";
	}
}
