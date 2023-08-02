package com.example.repo;

import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.dto.UserDto;
import com.example.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	@Query(value = "select New com.example.dto.UserDto( u.userId, u.firstName, u.lastName, u.email) from UserEntity u")
	public Collection<UserDto> customFind();
}
