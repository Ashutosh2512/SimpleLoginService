package com.Ashutosh.Securitydemo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Ashutosh.Securitydemo.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	
}
