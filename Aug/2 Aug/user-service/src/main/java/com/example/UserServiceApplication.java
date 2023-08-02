package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.UserDto;
import com.example.service.UserService;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RequestMapping("/users")
public class UserServiceApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@GetMapping
	public ResponseEntity<?> getStatus()
	{
		return ResponseEntity.status(HttpStatus.OK).body("user service is up");
	}
	
	public void run(String... args) throws Exception {
		UserDto user = new UserDto();
		user.setFirstName("John");
		user.setLastName("Doe");
		user.setEmail("jd@example.com");
		user.setPassword("123456");
		user.setUserId("jd123");
		userService.createUser(user);

		user = new UserDto();
		user.setFirstName("Jane");
		user.setLastName("Doe");
		user.setEmail("jjd@example.com");
		user.setPassword("asdfgh");
		user.setUserId("jjd123");
		userService.createUser(user);
	}
}
