package jpa.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import jpa.dao.UserDao;
import jpa.entitymodels.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	// this class handle database operations related to the User entity
	private SessionFactory sessionFactory;
	

	@Override
	public void saveUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }


	@Override
	public User getUserByEmail(String email) {
		Session session = sessionFactory.getCurrentSession();

		return session.byNaturalId(User.class).using("email", email).load();
	}

	@Override
	public List<User> getAllUsers() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM User", User.class).list();
	}

}
