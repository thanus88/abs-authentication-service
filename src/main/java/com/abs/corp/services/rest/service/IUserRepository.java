package com.abs.corp.services.rest.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.abs.corp.services.rest.model.User;

public interface IUserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);

}
