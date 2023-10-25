package org.perscholas.database.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Payment;

public class PaymentDAO {
	
	public Payment findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM Payment p WHERE p.id = ?1";
		
		TypedQuery<Payment> query = session.createQuery(hql, Payment.class);
		query.setParameter(1, id);
		
		Payment result = query.getSingleResult();
		return result;	
	}
	

}
