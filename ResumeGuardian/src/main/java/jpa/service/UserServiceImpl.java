package jpa.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

import jpa.dao.UserDao;
import jpa.entitymodels.User;

@Service
public class UserServiceImpl implements UserService{
	// this class handle business logic related to user operations
	
	private UserDao userDao;

	@Override
    @Transactional
    public void registerUser(User user) {
        userDao.saveUser(user);
    }

	@Override
	public boolean authenticateUser(String email, String password) {
	User user = userDao.getUserByEmail(email);
		return user != null && user.getPassword().equals(password);
	
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}
	

}
