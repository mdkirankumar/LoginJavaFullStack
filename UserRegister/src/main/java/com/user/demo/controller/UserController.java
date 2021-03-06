package com.user.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.user.demo.model.User;
import com.user.demo.repository.UserRepository;
import com.user.demo.service.UserService;


@RestController
@RequestMapping("/api/v1")
@CrossOrigin


public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository repo;

	
	@PostMapping("/register")
	 public String add(@RequestBody User user){
		userService.saveUser(user);
        return "New user is added";
    }
	

	
	@PostMapping("/login")
	public String login(@RequestBody User user) {
		String email = user.getEmail();
	     
		User userByEmail = repo.findByEmail(email);
		if(userByEmail != null) {
			return "success";
		} else {
			return "Login failed";
			
		}
		
		
	}
		
	}
	
	

