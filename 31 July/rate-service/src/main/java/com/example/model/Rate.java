package com.example.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document("rates")
public class Rate {
	@Id
	private String rateId;
	private String from;
	private String to;
	private int value;

	public Rate(String from, String to, int value) {
		super();
		this.from = from;
		this.to = to;
		this.value = value;
	}
}
