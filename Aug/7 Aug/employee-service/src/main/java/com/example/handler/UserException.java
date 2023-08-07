package com.example.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.exception.DeptNotFoundException;
import com.example.ui.ErrorResponseModel;

@ControllerAdvice
public class UserException {
	
	@ExceptionHandler
	public ResponseEntity<ErrorResponseModel> handleException(DeptNotFoundException e)
	{
		ErrorResponseModel model = new ErrorResponseModel(e.getMessage(),System.currentTimeMillis(),HttpStatus.NOT_FOUND.ordinal());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(model);
	}
}
