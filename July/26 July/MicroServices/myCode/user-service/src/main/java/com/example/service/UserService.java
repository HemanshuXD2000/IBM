package com.example.service;

import java.util.Collection;
import java.util.List;

import com.example.dto.UserDto;
import com.example.model.UserEntity;

public interface UserService {

	UserEntity createUser(UserEntity user);
	
	List<UserEntity> listUser();
	
	Collection<UserDto> query();
	
}
