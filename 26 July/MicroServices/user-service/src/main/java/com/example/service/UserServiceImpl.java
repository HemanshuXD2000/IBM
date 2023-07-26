package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.UserEntity;
import com.example.repo.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	@Override
	public UserEntity createUser(UserEntity user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<UserEntity> listUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
}
