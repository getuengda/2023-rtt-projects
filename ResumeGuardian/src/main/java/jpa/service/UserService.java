package jpa.service;

import java.util.List;

import jpa.entitymodels.User;

public interface UserService {
	
	void registerUser(User user);
    boolean authenticateUser(String email, String password);
    List<User> getAllUsers();
	
}
