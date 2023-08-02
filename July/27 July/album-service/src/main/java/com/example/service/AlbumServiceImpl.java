package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dao.AlbumDao;
import com.example.dto.AlbumDto;
import com.example.model.AlbumEntity;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AlbumServiceImpl implements AlbumService{

	private final AlbumDao albumDao;
	

	@Override
	public AlbumEntity saveAlbum(AlbumDto albumDto) {
		return albumDao.saveAlbum(albumDto);
	}

	@Override
	public List<AlbumEntity> getAllAlbum() {
		// TODO Auto-generated method stub
		return albumDao.getAllAlbum();
	}

}
