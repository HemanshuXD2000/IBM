package com.example.controller;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Customer;
import com.example.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	private CustomerService customerService;
	
	
	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@GetMapping("/list")
	public String listCustomer(Model theModel)
	{
		List<Customer> theCustomers = null;
		theCustomers = customerService.getAllCustomers();
		
		theModel.addAttribute("customers", theCustomers);
		return "customerList";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormAdd(Model theModel)
	{
		Customer customer = new  Customer();
		
		theModel.addAttribute("customer" , customer);
		return "customerForm";
	}
	
	@PostMapping("customer/save")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer)
	{
		theCustomer.setCustomerId(new Random().nextInt(100));
		customerService.saveCustomer(theCustomer);
		return "redirect:/customer/list";
	}
}
