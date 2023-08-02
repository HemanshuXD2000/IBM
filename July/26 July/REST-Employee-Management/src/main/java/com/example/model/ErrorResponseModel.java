package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponseModel {
	
	private long errorReportingTime;
	
	private String errorMessage;
	
	private int errorCode;
}
