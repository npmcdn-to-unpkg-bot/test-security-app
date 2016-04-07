package com.securityapp.main.service;

import java.util.List;

import com.securityapp.main.domain.User;
import com.securityapp.main.domain.requests.UserRequest;

public interface UserService {

	public boolean create(String username, String password);
	
	public List<User> getAll();
	public boolean loginUser(UserRequest userReq);
	
}
