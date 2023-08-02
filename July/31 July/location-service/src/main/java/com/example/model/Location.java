package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document("Location")
public class Location {
	@Id
	private String id;
	private int locationId;
	private LOCATION_NAME locationName;
	
	public Location(int locationId, LOCATION_NAME locationName) 
	{
		super();
		this.locationId = locationId;
		this.locationName = locationName;
	}
}
