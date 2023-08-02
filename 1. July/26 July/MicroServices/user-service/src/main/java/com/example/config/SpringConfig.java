package com.example.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class SpringConfig{

	@Bean
	ModelMapper modelMapper()
	{
		return new ModelMapper();
	}
}
