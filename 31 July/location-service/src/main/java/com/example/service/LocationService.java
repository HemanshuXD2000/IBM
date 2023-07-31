package com.example.service;

import org.springframework.http.ResponseEntity;

import com.example.model.Location;

public interface LocationService {

	ResponseEntity<String> saveLocation(Location location);
	Location findByLocationName(String locationName);
}
