package com.example.service;

import java.util.List;

import com.example.dto.UserDto;
import com.example.model.UserEntity;

public interface UserService {

	UserEntity createUser(UserDto userDto);
		
	List<UserEntity> listUser();
	
	UserEntity findByUserId(String userId);
	
}
