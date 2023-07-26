package com.example.rest;

import java.util.List;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.EmployeeNotFoundException;
import com.example.exception.MissingValueException;
import com.example.model.Employee;
import com.example.model.ErrorResponseModel;
import com.example.service.EmployeeService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	private final EmployeeService employeeService;
	
	@ExceptionHandler
	public ResponseEntity<ErrorResponseModel> handleErr(EmployeeNotFoundException e)
	{
		ErrorResponseModel model = new ErrorResponseModel();
		model.setErrorMessage(e.getMessage());
		model.setErrorCode(HttpStatus.NOT_FOUND.value());
		model.setErrorReportingTime(System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(model);
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorResponseModel> handleErr(MissingValueException e)
	{
		ErrorResponseModel model = new ErrorResponseModel();
		model.setErrorMessage(e.getMessage());
		model.setErrorCode(HttpStatus.NOT_FOUND.value());
		model.setErrorReportingTime(System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(model);
	}
	
	@PostMapping
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.createEmployee(employee));
	}
	
	@GetMapping
	public ResponseEntity<List<Employee>> getEmployees()
	{
		return ResponseEntity.ok(employeeService.listEmployees());
	}
	
	@GetMapping("/{employeeId}")
	public ResponseEntity<?> findEmployeeById(@PathVariable("employeeId") int employeeId)
	{
		Optional<Employee> optional = employeeService.getEmployeeById(employeeId);
		
		if(optional.isEmpty())
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee with ID: "+employeeId+" not found....");
		}
		else
		{
			return ResponseEntity.status(HttpStatus.FOUND).body(optional.get());
		}
	}
	
	@PutMapping
	public ResponseEntity<?> updateEmployee(@RequestBody Employee employee)
	{
		Employee emp = employeeService.updateEmployeeById(employee);
		if(emp == null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee with ID: "+employee.getEmployeeId()+ " not found....");
		}
		else
		{
			return ResponseEntity.status(HttpStatus.OK).body(emp);
		}
	}
	
	@DeleteMapping("/{employeeId}")
	public ResponseEntity<?> deleteEmployee(@PathVariable("employeeId") int employeeId)
	{
		employeeService.deleteEmployee(employeeId);
		return ResponseEntity.status(HttpStatus.OK).body("Employee Deleted..");

	}
	
	@GetMapping("/find/{firstName}")
	public ResponseEntity<?> findByFirstName(@PathVariable("firstName") String firstName)
	{
		List<Employee> employees = employeeService.findByFirstName(firstName);
		
		if(employees==null)
		{
			throw new EmployeeNotFoundException("Employee with first name: "+firstName+" not found...");
		}
		else
		{
			return ResponseEntity.status(HttpStatus.OK).body(employees);
		}
	}
	
	@GetMapping("/finds/")
	public ResponseEntity<?> findByFirstNameOrLastName(@RequestParam(name = "firstName" ,required = false) String firstName, @RequestParam(name = "lastName", required = false) String lastName)
	{
		List<Employee> employees = employeeService.findByFirstNameOrLastName(firstName, lastName);
		
		if(employees.isEmpty())
		{
			throw new MissingValueException("FirstName or Lastname not found..");
		}
		else
		{
			return ResponseEntity.status(HttpStatus.OK).body(employees);
		}
	}
	
	@GetMapping("/findName/")
	public ResponseEntity<?> findByFirstNameAndLastName(@RequestParam(name = "firstName" ,required = true) String firstName, @RequestParam(name = "lastName", required = true) String lastName)
	{
		List<Employee> employees = employeeService.findByFirstNameAndLastName(firstName, lastName);
		
		if(employees.isEmpty())
		{
			throw new MissingValueException("FirstName and Lastname not found..");
		}
		else
		{
			return ResponseEntity.status(HttpStatus.OK).body(employees);
		}
	}
}
