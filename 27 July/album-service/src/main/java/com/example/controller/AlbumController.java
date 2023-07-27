package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.AlbumDto;
import com.example.model.AlbumEntity;
import com.example.service.AlbumService;
import com.example.ui.AlbumRequestModel;
import com.example.ui.AlbumResposneModel;

import jakarta.ws.rs.NotFoundException;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("album")
public class AlbumController {

	private final ModelMapper modelMapper;
	private final AlbumService albumService;
	
	@PostMapping
	public ResponseEntity<AlbumResposneModel> saveAlbum(@RequestBody AlbumRequestModel albumRequestModel)
	{
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		AlbumDto albumDto = modelMapper.map(albumRequestModel, AlbumDto.class);
		albumDto.setAlbumId(UUID.randomUUID().toString());
		albumDto.setUserId(UUID.randomUUID().toString());
		AlbumEntity albumEntity = albumService.saveAlbum(albumDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(modelMapper.map(albumEntity, AlbumResposneModel.class));
	}
	
	@GetMapping
	public ResponseEntity<List<AlbumResposneModel>> getAllAlbums()
	{
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<AlbumEntity> list = albumService.getAllAlbum();
		List<AlbumResposneModel> albumResposneModels = new ArrayList<AlbumResposneModel>();
		for(AlbumEntity a : list)
		{
			albumResposneModels.add(modelMapper.map(a, AlbumResposneModel.class));
		}		
			return ResponseEntity.status(HttpStatus.OK).body(albumResposneModels);
	}
}

