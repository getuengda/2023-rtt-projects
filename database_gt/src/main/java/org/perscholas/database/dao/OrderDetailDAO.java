package org.perscholas.database.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.Order;
import org.perscholas.database.entity.OrderDetail;

public class OrderDetailDAO {

	public OrderDetail findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM OrderDetail od WHERE od.id = ?1"; // Example of HQL to get all records of user class

		TypedQuery<OrderDetail> query = session.createQuery(hql, OrderDetail.class);
		query.setParameter(1, id);

		OrderDetail result = query.getSingleResult();
		return result;
	}

	// @ManyToOne relationship : OrderDetail table with Order
//		public void queryOrderDetail() {
//			OrderDetailDAO orderDetailDao = new OrderDetailDAO();
//		
//			OrderDetail od = orderDetailDao.findById(2984);
//		
//		// this gets the orderdetail for this specific order
//		// Hibernate will write and execute the query for itself -- 
//		// no code needed other than the setup linkage annotations 
//		Order o = od.getOrder();
//		
//		System.out.println("OrderDetail " + od.getId() + " was made by an order " + od.getOrder() + " on " + od.getQuantityOrdered());
//		//all the customers orders
//		List<OrderDetail> orderdetail = o.getOrderdetail();
//		for(OrderDetail orderdt : orderdetail) {
//			System.out.print("orderdetail" + orderdt.getId());
//		}
//		}

	public void queryOrderDetail() {
		OrderDetailDAO orderDetailDao = new OrderDetailDAO();
		int orderDetailId = 2984;

		// Retrieve the OrderDetail entity by its ID
		OrderDetail orderDetail = orderDetailDao.findById(2984);

		// Check if the orderDetail exists
		if (orderDetail != null) {
			// Access the associated Order entity
			Order order = orderDetail.getOrder();

			// Print order detail
			System.out.println("OrderDetail " + orderDetail.getId() + " was made for order " + order.getId()
					+ " with quantity ordered: " + orderDetail.getQuantityOrdered());

			// Access and print all the order details for the order
			List<OrderDetail> orderDetails = order.getOrderdetail();
			System.out.println("Order's order details:");
			for (OrderDetail orderDt : orderDetails) {
				System.out.println(
						"OrderDetail " + orderDt.getId() + " with quantity ordered: " + orderDt.getQuantityOrdered());
			}
		} else {
			System.out.println("OrderDetail with ID " + orderDetailId + " not found.");
		}
	}

}
