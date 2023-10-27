package org.perscholas.database.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.Product;

public class ProductDAO {
	
	public Product findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM Product p WHERE p.id = ?1"; // Example of HQL to get all records of user class
		
		TypedQuery<Product> query = session.createQuery(hql, Product.class);
		query.setParameter(1, id);
		
		Product result = query.getSingleResult();
		return result;
	}
	
	
	public List<Product> findProductByName(String partialProductName) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM Product p WHERE productName LIKE :partialName";
		//String hql = "FROM Product p WHERE productName = : productName"; // Example of HQL to get all records of user class

		TypedQuery<Product> query = session.createQuery(hql, Product.class);
		query.setParameter("partialName", "%" + partialProductName + "%");

		//Product result = query.getSingleResult();
		//return result;
		
		List<Product> result = query.getResultList();
		return result;
	}
	
	public void save ( Product product) { 
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		
		session.saveOrUpdate(product);
		t.commit();
	}

}
