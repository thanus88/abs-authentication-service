package com.abs.corp.services.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abs.corp.services.rest.model.Customer;
import com.abs.corp.services.rest.model.User;
import com.abs.corp.services.rest.service.CustomUserDetailsService;

@RestController
public class LoginController {
	
	@Autowired
	private CustomUserDetailsService userService;
	
	@GetMapping(value = "/login")
	public ResponseEntity<?> login(@RequestParam String email) {
    	User user = userService.findUserByEmail(email);
    	if(user != null)
    		return ResponseEntity.ok(user);
    	else
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("USER NOT FOUND");
    }
	
	@PostMapping(value = "/signup")
    public ResponseEntity<?> signup(@RequestBody User user) {
	    User userExists = userService.findUserByEmail(user.getEmail());
	    if (userExists != null) {
	    	return ResponseEntity.status(HttpStatus.FOUND).body("There is already a user registered with the username provided.");
	        
	    } else {
	    	UserDetails userDetails = userService.saveUser(user);
	        return ResponseEntity.ok(userDetails);
	    }
    }
	
}
