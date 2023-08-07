package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Tutorial;
import com.example.repository.TutorialRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1")
public class TutorialController {

	@Autowired
	private TutorialRepository tutorialRepository;
	
	@GetMapping("/tutorials")
	public List<Tutorial> getAllTutorials()
	{
		return tutorialRepository.findAll();
	}
	
	@PostMapping("/tutorials")
	public Tutorial createTutorial(@RequestBody Tutorial tutorial)
	{
		return tutorialRepository.save(tutorial);
	}
}
