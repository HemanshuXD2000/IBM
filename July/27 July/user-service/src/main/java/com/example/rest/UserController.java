package com.example.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.UserDto;
import com.example.exception.UserNotFoundException;
import com.example.model.UserEntity;
import com.example.service.UserService;
import com.example.ui.UserRequestModel;
import com.example.ui.UserResponseModel;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/userservice")
public class UserController {

	private final UserService userService;
	private final ModelMapper modelMapper;
	
	@PostMapping
	public ResponseEntity<UserResponseModel> createUser(@RequestBody UserRequestModel userRequestModel)
	{
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserDto userDto = modelMapper.map(userRequestModel, UserDto.class);
		userDto.setUserId(UUID.randomUUID().toString());
		UserEntity userEntity = userService.createUser(userDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(modelMapper.map(userEntity, UserResponseModel.class));
	}
	
	@GetMapping
	public ResponseEntity<List<UserResponseModel>> listAllUsers()
	{
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<UserEntity> list = userService.listUser();
		List<UserResponseModel> userResponseModels = new ArrayList<UserResponseModel>();
		for(UserEntity u : list)
		{
			userResponseModels.add(modelMapper.map(u, UserResponseModel.class));
		}
		return ResponseEntity.status(HttpStatus.OK).body(userResponseModels);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserResponseModel> getUserById(@PathVariable("userId") String userId) throws UserNotFoundException
	{
		UserEntity userEntity = userService.findByUserId(userId);
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		if(userEntity==null)
		{
			throw new UserNotFoundException("User with "+userId+" not found");
		}
		else
		{
			return ResponseEntity.ok(modelMapper.map(userEntity, UserResponseModel.class));
		}
	}
}
