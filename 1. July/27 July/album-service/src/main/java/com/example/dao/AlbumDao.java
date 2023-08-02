package com.example.dao;

import java.util.List;

import com.example.dto.AlbumDto;
import com.example.model.AlbumEntity;

public interface AlbumDao {
	
	public AlbumEntity saveAlbum(AlbumDto albumDto);
	
	public List<AlbumEntity> getAllAlbum();
}
