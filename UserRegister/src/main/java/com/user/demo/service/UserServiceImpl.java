package com.user.demo.service;

import com.user.demo.model.User;
import com.user.demo.repository.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	private UserRepository repo;
	
	@Override
	public User saveUser(User user){
	        return userRepository.save(user);
	    }
	
	
	public User login(String username, String password) {
		User user = repo.findByUsernameAndPassword(username, password);
		return user;
		
	}

	   

}
