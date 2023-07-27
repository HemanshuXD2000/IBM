package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name="Users")
public class UserEntity {
	
	private String userId;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;
	
	
	private String encryptedPassword;

	public UserEntity(String userId, String firstName, String lastName, String email, String password,
			String encryptedPassword) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.encryptedPassword = encryptedPassword;
	}
}
