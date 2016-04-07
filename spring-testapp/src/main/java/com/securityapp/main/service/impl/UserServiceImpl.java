package com.securityapp.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.securityapp.main.domain.User;
import com.securityapp.main.domain.requests.UserRequest;
import com.securityapp.main.repository.UserRepository;
import com.securityapp.main.service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repository;

	@Override
	public boolean create(String username, String password) {

		User user = new User(username, password);

		System.out.println("***********************************");
		System.out.println("Creating user: " + user);
		System.out.println("***********************************");

		if (repository.findByUsername(username) != null) {

			return false;

		} else {

			repository.save(user);
			return true;

		}

	}

	@Override
	public List<User> getAll() {

		return (List<User>) repository.findAll();

	}

	@Override
	public boolean loginUser(UserRequest attemptedLogin) {

		System.out.printf("Attempting login with username: %s and password: %s", attemptedLogin.getUsername(),
				attemptedLogin.getPassword());

		User user = repository.findByUsername(attemptedLogin.getUsername());

		System.out.println("User we found: " + user);

		if (user == null) {
			return false;
		} else {

			if (user.getPassword().equals(attemptedLogin.getPassword())) {
				return true;
			}

			else

			{
				return false;
			}

		}
	}

}
