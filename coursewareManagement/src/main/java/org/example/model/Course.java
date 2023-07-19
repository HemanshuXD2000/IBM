package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Course {

	private int id;
	private String courseName;
	private Double coursePrice;
	
	public Course(String courseName, Double coursePrice) {
		//super();
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}	
}
