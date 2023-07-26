package com.example.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private String message;
}
