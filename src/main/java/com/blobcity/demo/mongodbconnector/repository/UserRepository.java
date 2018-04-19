package com.blobcity.demo.mongodbconnector.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.blobcity.demo.mongodbconnector.model.User;

public interface UserRepository extends MongoRepository<User, String> {

    public User findOneByName(String name);

}