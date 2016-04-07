package com.securityapp.main.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.securityapp.main.domain.requests.CreateUserRequest;

@RestController
public class UserController {

	@RequestMapping(value="/public/createuser",method=RequestMethod.POST)
	public @ResponseBody String create(@RequestBody CreateUserRequest req){

		System.out.println("Received data: " + req.getUsername() + ", " + req.getPassword());
		
		return "Successful post.";
	}
	
//	@RequestMapping(value="/public/createuser", method=RequestMethod.GET)
//	public String hello(){
//		
//		System.out.println("GOT DATA");
//		
//		return "whats up?";
//		
//	}
	
}
