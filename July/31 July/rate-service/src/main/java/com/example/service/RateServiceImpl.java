package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.Rate;
import com.example.repo.RateRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RateServiceImpl implements RateService{

	private final RateRepository rateRepository;
	
	@Override
	public Rate createRate(Rate rate) {
		return rateRepository.save(rate);
	}

	@Override
	public Rate findRate(String fromCurrency, String toCurrency) {
		// TODO Auto-generated method stub
		return rateRepository.findByFromAndTo(fromCurrency, toCurrency);
	}

}
