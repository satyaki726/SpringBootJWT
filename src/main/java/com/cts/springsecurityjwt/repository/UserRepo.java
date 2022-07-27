package com.cts.springsecurityjwt.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cts.springsecurityjwt.model.User;

@Repository
public interface UserRepo extends MongoRepository<User, String>{

	User findByUserName(String userName);
}
