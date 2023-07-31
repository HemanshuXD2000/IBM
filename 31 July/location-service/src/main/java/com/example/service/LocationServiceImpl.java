package com.example.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.model.Location;
import com.example.repo.LocationRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class LocationServiceImpl implements LocationService {

	private final LocationRepository locationRepository;
	
	@Override
	public ResponseEntity<String> saveLocation(Location location) {
		locationRepository.save(location);
		return new ResponseEntity<>("Location saved successfully...",HttpStatus.CREATED);
	}

	@Override
	public Location findByLocationName(String locationName) {
		return locationRepository.findByLocationName(locationName);
	}

}
