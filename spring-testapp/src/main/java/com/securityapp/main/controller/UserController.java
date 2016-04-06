package com.securityapp.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping(value="/public/createuser",method=RequestMethod.POST)
	public String create(){

		System.out.println("POSTED DATA");
		
		return null;
	}
	
	@RequestMapping(value="/public/createuser", method=RequestMethod.GET)
	public String hello(){
		
		System.out.println("GOT DATA");
		
		return "whats up?";
		
	}
	
}
