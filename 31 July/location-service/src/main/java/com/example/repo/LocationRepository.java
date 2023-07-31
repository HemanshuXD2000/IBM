package com.example.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.model.Location;

@EnableMongoRepositories
public interface LocationRepository extends MongoRepository<Location, String>{
		
	@Query
	Location findByLocationName(String locationName);
	}
