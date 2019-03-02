package com.abs.corp.services.rest.dao;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.abs.corp.services.rest.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {
    List<Customer> findByFirstName(String firstName);
}
