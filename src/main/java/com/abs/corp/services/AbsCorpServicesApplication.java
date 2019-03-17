package com.abs.corp.services;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.abs.corp.services.rest.model.Role;
import com.abs.corp.services.rest.service.IRoleRepository;

@SpringBootApplication
public class AbsCorpServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbsCorpServicesApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(IRoleRepository roleRepository) {

	    return args -> {

	        Role adminRole = roleRepository.findByRole("ADMIN");
	        if (adminRole == null) {
	            Role newAdminRole = new Role();
	            newAdminRole.setRole("ADMIN");
	            roleRepository.save(newAdminRole);
	        }

	        Role userRole = roleRepository.findByRole("USER");
	        if (userRole == null) {
	            Role newUserRole = new Role();
	            newUserRole.setRole("USER");
	            roleRepository.save(newUserRole);
	        }
	    };

	}

}
