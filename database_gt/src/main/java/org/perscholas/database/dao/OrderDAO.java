package org.perscholas.database.dao;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.Order;

public class OrderDAO {
	

	public Order findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Order o WHERE o.id = ?1"; // Example of HQL to get all records of user class

		TypedQuery<Order> query = session.createQuery(hql, Order.class);
		query.setParameter(1, id);

		Order result = query.getSingleResult();
		return result;
	}

	public void save(Order order) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();
		session.saveOrUpdate(order);
		t.commit();
	}

	// create a main method that will use the scanner to ask the user for a customer
	// id, then query the customer .. and create a new order using the customer id
	// ... only if the customer id exists in the database
	public List<Order> findOrderByCustomerId(Integer customerId) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Order o WHERE o.customerId = :customerId";

		TypedQuery<Order> query = session.createQuery(hql, Order.class);
		query.setParameter("customerId", customerId);

		List<Order> result = query.getResultList();
		return result;
	}

	public void createorderIfNotExist(){
		OrderDAO orderDao = new OrderDAO();
		//check if an order with the given Id already exists
		int orderId = 1; // Set your desired order ID

		try {
		    // Check if an order with the given ID already exists
		    Order existingOrder = orderDao.findById(orderId);

		    if (existingOrder != null) {
		        System.out.println("Order with ID " + orderId + " already exists.");
		        return;
		    }

		    // Create a new order
		    Order newOrder = new Order();

		    // Set order dates
		    Date orderDate = new Date();
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		    Date requiredDate = sdf.parse("2023-10-31");

		    newOrder.setOrderDate(orderDate);
		    newOrder.setRequiredDate(requiredDate);
		    newOrder.setShippedDate(requiredDate); // Shipped date set to null because the order has not yet shipped

		    // Save the new order to the database
		    orderDao.save(newOrder);
		    System.out.println("Order with ID " + newOrder.getId() + " created successfully.");
		} catch (ParseException e) {
		    System.out.println("Error parsing date: " + e.getMessage());
		    // Handle the exception (log it, show user-friendly message, etc.)
		} catch (Exception e) {
		    System.out.println("Error occurred: " + e.getMessage());
		    // Handle other exceptions if necessary
		}

		
	}
	/////     
	public void insertOrderIfCustomerIdExist(Customer c) throws ParseException{
		Date orderDate = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date requiredDate = sdf.parse("2022-10-31");
		Date shippedDate = sdf.parse("2023-07-28");
		
		  // If the customer ID exists in the database, create a new order
		  if (c != null) {
			Order new_o = new Order();
			
			new_o.setCustomer(c);
			new_o.setOrderDate(new Date());
			new_o.setRequiredDate(requiredDate);
			new_o.setShippedDate(shippedDate);
			new_o.setStatus("In Progress New");

		    // Set the order date to the current date
			//new_o.setOrderDate(new Date());
		    
			//Create the order in the database
		    	
		    System.out.println("Order created successfully!" + new_o.getId());
		    }else {
			System.out.println("Customer ID does not exist.");
		}  
	}
	
	// @ManyToOne relationship : Order table with Customer
	public void queryOrder() {
	OrderDAO orderDao = new OrderDAO();
	
	Order o = orderDao.findById(10100);
	
	// this gets the customer for this specific order
	// Hibernate will write and execute the query for itself -- 
	// no code needed other than the setup linkage annotations 
	Customer c = o.getCustomer();
	
	System.out.println("Order " + o.getId() + " was made by customer " + c.getCustomerName() + " on " + o.getOrderDate());
	//all the customers orders
	List<Order> orders = c.getOrders();
	for(Order order : orders) {
		System.out.print("order" + order.getId());
	}
	}
}

