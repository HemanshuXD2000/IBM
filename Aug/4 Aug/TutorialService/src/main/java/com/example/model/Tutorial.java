package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

@Entity
@Table(name = "tutorial")
public class Tutorial {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tutorialId;
	private String description;
	private String isAvailable;
	
	public Tutorial(String descrption, String isAvailable) {
		super();
		this.description = descrption;
		this.isAvailable = isAvailable;
	}
}
