package com.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.ui.LocationDto;

@FeignClient(value="LOCATION-SERVICE")
public interface LocationClient {
	
	@GetMapping("/location/{locationName}")
	LocationDto getLocationByName(@PathVariable String locationName);
}
