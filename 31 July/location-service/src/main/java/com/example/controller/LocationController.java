package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Location;
import com.example.service.LocationService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/location")
public class LocationController {

	private final LocationService locationService;
	
	@PostMapping
	public ResponseEntity<String> saveLocation(@RequestBody Location location)
	{
		ResponseEntity <String> responseEntity = locationService.saveLocation(location);
		return responseEntity;
	}
	
	@GetMapping("/{locationName}")
	public Location findByName(@PathVariable String locationName)
	{
		return locationService.findByLocationName(locationName);
	}
}
