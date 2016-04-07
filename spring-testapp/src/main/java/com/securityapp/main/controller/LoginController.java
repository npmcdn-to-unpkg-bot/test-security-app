package com.securityapp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.securityapp.main.domain.requests.UserRequest;
import com.securityapp.main.service.UserService;

@RestController
public class LoginController {
	
	@Autowired
	UserService userService;

	@RequestMapping(value="/public/login",method=RequestMethod.POST)
	public void login(@RequestBody UserRequest userReq){
		
		if(userService.loginUser(userReq)){
			
			System.out.println("Login successful!");
			
		}else{
			
			System.out.println("Login failed!");
			
		}
		
	}
	
}
