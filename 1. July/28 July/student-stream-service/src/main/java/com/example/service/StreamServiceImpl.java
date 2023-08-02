package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.model.Stream;
import com.example.repo.StreamRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class StreamServiceImpl implements StreamService {

	private StreamRepository repository;
	
	@Override
	public Stream createStream(Stream stream) {
		// TODO Auto-generated method stub
		return repository.save(stream);
	}

	@Override
	public Optional<Stream> findStream(String id) {
		// TODO Auto-generated method stub
		return repository.findById(id);			
	}

	@Override
	public List<Stream> getAllStream() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
