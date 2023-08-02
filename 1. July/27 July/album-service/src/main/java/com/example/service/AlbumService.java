package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dto.AlbumDto;
import com.example.model.AlbumEntity;

@Service
public interface AlbumService {
	
	public AlbumEntity saveAlbum(AlbumDto albumDto);
	
	public List<AlbumEntity> getAllAlbum();
	
}
