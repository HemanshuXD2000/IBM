package com.example.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.model.Rate;

@EnableMongoRepositories
public interface RateRepository extends MongoRepository<Rate, String>{
 
	Rate findByFromAndTo(String from, String to);
}
