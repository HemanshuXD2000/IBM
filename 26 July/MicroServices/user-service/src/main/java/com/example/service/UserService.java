package com.example.service;

import java.util.List;

import com.example.model.UserEntity;

public interface UserService {

	UserEntity createUser(UserEntity user);
	
	List<UserEntity> listUser();
}
