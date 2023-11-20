package jpa.dao;

import java.util.List;

import jpa.entitymodels.User;


public interface UserDao {
	// this interface with the implementation handle 
	// database operations related to the User entity
	void saveUser(User user);
    User getUserByEmail(String email);
    List<User> getAllUsers();
}
