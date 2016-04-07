package com.securityapp.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.securityapp.main.domain.User;
import com.securityapp.main.domain.requests.UserRequest;
import com.securityapp.main.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;

	@RequestMapping(value="/public/createuser",method=RequestMethod.POST)
	public void create(@RequestBody UserRequest req){

		if(userService.create(req.getUsername(), req.getPassword()))
		{
			System.out.println("user created");
			
		}else{
			
			System.out.println("user exists");
			
		}
		
	}
	
	@RequestMapping(value="/public/getusers",method=RequestMethod.GET)
	public @ResponseBody List<User> getAllUsers(){
	
		List<User> response = userService.getAll();
		
		return response;
		
	}
	
}
