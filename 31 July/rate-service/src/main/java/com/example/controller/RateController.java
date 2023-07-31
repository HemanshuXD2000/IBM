package com.example.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/{from}/{to}")
	public ResponseEntity<Rate> getRate(@PathVariable String from, @PathVariable String to){
		Rate rate = rateService.findRate(from, to);
		if(rate == null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		else
		{
			return ResponseEntity.ok(rate);
		}
	}
}
