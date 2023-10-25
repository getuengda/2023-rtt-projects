package org.perscholas.database.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.Order;
import org.perscholas.database.entity.OrderDetail;
import org.perscholas.database.entity.Product;

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
	// Eric's Demo
	public void save(OrderDetail orderDetail) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();
		session.saveOrUpdate(orderDetail);
		t.commit();
		session.close();
	}
	
	// @ManyToOne relationship : OrderDetail table with Order
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
	
	// @ManyToOne relationship : OrderDetail table with Order
		public void queryProductDetail() {
			OrderDetailDAO orderDetailDao = new OrderDetailDAO();
			//int orderDetailId = 2984;

			// Retrieve the OrderDetail entity by its ID
			OrderDetail orderDetail = orderDetailDao.findById(2984);

			// Check if the orderDetail exists
			if (orderDetail != null) {
				// Access the associated Order entity
				Product product = orderDetail.getProduct();

				// Print order detail associated with the product
				System.out.println("OrderDetail " + orderDetail.getId() + " was made for order " + product.getProductCode()
						+ " with quantity ordered: " + orderDetail.getQuantityOrdered());

				// Access and print all the order details for the order
				List<OrderDetail> orderDetails = product.getOrderdetail();
				System.out.println("Product's orderdetails:");
				for (OrderDetail orderDt : orderDetails) {
					System.out.println(
							"OrderDetail " + orderDt.getId() + " with quantity ordered: " + orderDt.getProduct());
				}
			} else {
				System.out.println("OrderDetail with ID " + "orderDetailId" + " not found.");
			}
		}
		

}
