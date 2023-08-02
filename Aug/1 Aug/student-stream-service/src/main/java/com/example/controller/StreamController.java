package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Stream;
import com.example.service.StreamService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/streams")
public class StreamController {

	private final StreamService service;
	
	@GetMapping("/status")
	public ResponseEntity<?> getStatus()
	{
		return ResponseEntity.status(HttpStatus.OK).body("status ok");
	}
	
	@PostMapping
	public ResponseEntity<Stream> createStream(@RequestBody Stream stream)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(service.createStream(stream));
	}
	
	@GetMapping("/{_id}")
	public ResponseEntity<?> getStreamById(@PathVariable("_id") String id)
	{
		Optional<Stream> optional = service.findStream(id);
		if(optional.isEmpty())
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Stream with ID '"+id+"' not found...");
		}
		else			
		{
			return ResponseEntity.status(HttpStatus.FOUND).body(optional.get());
		}
	}
	
	@GetMapping
	public ResponseEntity<List<Stream>> listAllStream()
	{
		return ResponseEntity.ok(service.getAllStream());
	}
	
	@PutMapping("/{_id}")
	public ResponseEntity<?> updateById(@PathVariable("_id") String id, @RequestBody Stream stream)
	{
		Stream tempStream = service.updateStreamById(id, stream);
		if(tempStream == null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Stream with ID '"+id+"' not found...");
		}
		else
		{
			return new ResponseEntity<Stream>(tempStream,HttpStatus.OK);
		}
	}
	
	@DeleteMapping("/{_id}")
	public ResponseEntity<?> deleteById(@PathVariable("_id") String id)
	{
		service.deleteById(id);
		return (ResponseEntity<?>) ResponseEntity.ok();
	}
	
}
