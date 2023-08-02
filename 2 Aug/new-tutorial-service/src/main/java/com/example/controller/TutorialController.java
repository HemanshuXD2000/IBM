package com.example.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.example.dao.TutorialRepository;
import com.example.model.Tutorial;
import com.example.ui.UserRequest;
import com.example.ui.UserResponse;

@RepositoryRestController
public class TutorialController {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	TutorialRepository tutorialRepository;
	
	@PostMapping("/tutorials")
	public ResponseEntity<?> getUser(@RequestBody UserRequest userRequest)
	{
		if(userRequest.getUserId() == null || userRequest.getPassword() == null)
		{
			return ResponseEntity.status(400).body("UserId and Password are required..");
		}
		try {
			restTemplate.postForObject("http://localhost:9998/userservice/validate", userRequest, UserResponse.class);
			
		}
		catch (RestClientException e) {
			return ResponseEntity.badRequest().body("Bad Credentials");
		}
		Tutorial tutorial = new Tutorial();
		tutorial.setDescription(userRequest.getDescription());
		tutorial.setActive(userRequest.isActive());
		tutorial = tutorialRepository.save(tutorial);
		return ResponseEntity.ok(tutorial);
	}
}
