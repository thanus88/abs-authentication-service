package com.abs.corp.services.rest.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.abs.corp.services.rest.model.Role;

public interface IRoleRepository extends MongoRepository<Role, String> {

    Role findByRole(String role);
}
