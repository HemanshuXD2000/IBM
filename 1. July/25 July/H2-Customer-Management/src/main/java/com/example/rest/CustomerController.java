package com.example.rest;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.valves.ErrorReportValve;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.CustomerNotFoundException;
import com.example.model.Customer;
import com.example.model.ErrorResponse;
import com.example.service.CustomerService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/customers")
public class CustomerController {

	private final CustomerService customerService;

	@ExceptionHandler
	public ResponseEntity<ErrorResponse> handleErr(CustomerNotFoundException e) {
		ErrorResponse model = new ErrorResponse();
		model.setErrorCode(HttpStatus.NOT_FOUND.value());
		model.setErrorMessage(e.getMessage());
		model.setErrorCode(HttpStatus.NOT_FOUND.value());
		model.setErrorReportingTime(System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(model);
	}
	@PostMapping
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer Customer)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(customerService.createCustomer(Customer));
	}
	
	@GetMapping
	public ResponseEntity<List<Customer>> getCustomers()
	{
		return ResponseEntity.ok(customerService.getAllCustomers());
	}
	
	@GetMapping("/{CustomerId}")
	public ResponseEntity<?> findCustomerById(@PathVariable("CustomerId") int CustomerId)
	{
		Optional<Customer> optional = customerService.getCustomerById(CustomerId);
		
		if(optional.isEmpty())
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Customer with ID: "+CustomerId+" not found....");
		}
		else
		{
			return ResponseEntity.status(HttpStatus.FOUND).body(optional.get());
		}
	}
	
	@PutMapping
	public ResponseEntity<?> updateCustomer(@RequestBody Customer Customer)
	{
		Customer emp = customerService.updateCustomerById(Customer);
		if(emp == null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Customer with ID: "+Customer.getCustomerId()+ " not found....");
		}
		else
		{
			return ResponseEntity.status(HttpStatus.OK).body(emp);
		}
	}
	
	@DeleteMapping("/{CustomerId}")
	public ResponseEntity<?> deleteCustomer(@PathVariable("CustomerId") int CustomerId)
	{
		customerService.deleteCustomerById(CustomerId);
		return ResponseEntity.status(HttpStatus.OK).body("Customer Deleted..");

	}
}