package org.example.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "course_table")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private int Id;
	
	@Column(name = "course_name")
	private String course_name;
	
	@Column(name = "course_price")
	private Double course_price;

	public CourseEntity(String course_name, Double course_price) {
		super();
		this.course_name = course_name;
		this.course_price = course_price;
	}   
}
