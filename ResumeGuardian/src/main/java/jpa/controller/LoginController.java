package jpa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jpa.entitymodels.LoginForm;
import jpa.entitymodels.User;
import jpa.repository.UserDaoImpl;

public class LoginController {
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody LoginForm form){
		// process login logic and return a response
		if(isValidUser(form)) {
			return ResponseEntity.ok("Login Successful");
		}else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credential");
		}
	}
	
	private boolean isValidUser(LoginForm form) {
		// Implement you user validation logic below
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		// Retrieve the existing user from the database or other authentication mechanisms
	    User existingUser = userDaoImpl.getUserByEmail(form.getEmail());

	    // Check if the existing user is not null and if the passwords match
	    if (existingUser != null && existingUser.getPassword().equals(form.getPassword())) {
	        return true;
	    }

	    // If no match is found, return false
	    return false;
	}
}
