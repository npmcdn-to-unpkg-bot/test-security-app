package com.securityapp.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.securityapp.main.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{

	public User findByUsername(String username);
	
}
