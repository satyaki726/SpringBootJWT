package com.cts.springsecurityjwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.springsecurityjwt.model.User;
import com.cts.springsecurityjwt.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepo userRepo;
	
	@Override
	public User saveConsumer(User user) {
		return userRepo.save(user);
	}
	

}
