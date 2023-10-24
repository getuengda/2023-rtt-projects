package com.perscholas.hib.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.perscolas.hib.model.User;

public class DeletingUser {

	// We will call the session.remove(Object) method to remove a mapped object from
	// the database.
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		User u = new User();
	    u.setId(5);
	    session.remove(u);
	    tx.commit();
	    session.close();
	    factory.close();

	}

}
