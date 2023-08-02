package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.ui.ExchangeRate;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ConversionController {

	private final RestTemplate restTemplate;
	private final String rateServiceUrl = "http://localhost:9999/RATE-SERVICE/rate/";
	
	@GetMapping("/convert")
	public ResponseEntity<Double> convertCurrency(
			@RequestParam("amount") Double amount,
			@RequestParam("from") String fromCurrency,
			@RequestParam("to") String toCurrency)
	{
		ExchangeRate exchangeRate = restTemplate.getForObject(rateServiceUrl+"{from}/{to}", ExchangeRate.class,
				fromCurrency,toCurrency);
		if(exchangeRate == null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		Double convertedAmount = amount * exchangeRate.getValue();
		return ResponseEntity.status(HttpStatus.OK).body(convertedAmount);
	}
	
}
