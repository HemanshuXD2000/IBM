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

	@Override
	public Stream updateStreamById(String id, Stream newstream) {
		// TODO Auto-generated method stub
		Stream stream = repository.findById(id).orElse(null);
		if(stream!=null)
		{
			stream.setStreamHead(newstream.getStreamHead());
			stream.setStreamName(newstream.getStreamName());
			return repository.save(stream);
		}
		return null;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}


}
