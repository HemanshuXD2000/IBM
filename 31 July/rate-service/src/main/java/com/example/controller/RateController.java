package com.example.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Rate;
import com.example.service.RateService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/rate")
public class RateController {
	
	private final RateService rateService;
	
	@PostMapping
	public ResponseEntity<Rate> createRate(@RequestBody Rate rate)
	{
		rate.setRateId(UUID.randomUUID().toString());
		return ResponseEntity.status(HttpStatus.CREATED).body(rateService.createRate(rate));
	}
}
