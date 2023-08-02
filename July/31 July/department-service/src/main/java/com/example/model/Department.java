package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="department_table")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int departmentId;
	private String departmentName;
	private String location;
	
	public Department(String departmentName, String location) {
		super();
		this.departmentName = departmentName;
		this.location = location;
	}
}
