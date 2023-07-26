package com.example.rest;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.UserEntity;
import com.example.service.UserService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/userservice")
public class UserController {

	private final UserService userService;
	
	@PostMapping
	public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user)
	{
		String userId = UUID.randomUUID().toString();
		user.setUserId(userId);
		
		String pass = user.getPassword();
		String encrypt = new StringBuilder(pass).reverse().toString();
		user.setEncryptedPassword(encrypt);
		
		return ResponseEntity.status(HttpStatus.OK).body(userService.createUser(user));
	}
	
	@GetMapping
	public ResponseEntity<List<UserEntity>> getUsers()
	{
		return ResponseEntity.ok(userService.listUser());
	}
}
