package org.perscholas.database;


import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import org.perscholas.database.dao.CustomerDAO;
import org.perscholas.database.dao.OrderDAO;
import org.perscholas.database.dao.OrderDetailDAO;
import org.perscholas.database.dao.PaymentDAO;
import org.perscholas.database.dao.ProductDAO;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.Order;
import org.perscholas.database.entity.Product;
import org.perscholas.database.entity.OrderDetail;
import org.perscholas.database.entity.Payment;

public class HibernateExample {

	public static void main(String[] args){
		// Customer
//		CustomerDAO customerDao = new CustomerDAO();
//		Customer customer = customerDao.findById(103);
//		System.out.println(customer.getId() + " | " + customer.getCustomerName());
//		
//		List<Customer> customers = customerDao.findByFirstName("Leslie");
//		for ( Customer c : customers ) {
//			System.out.println(c.getId() + " | " + c.getCustomerName() + " | " + c.getContactFirstname() + " | " + c.getContactLastname());
//		}
		
		// Product
//		ProductDAO productDao = new ProductDAO();
//		Product product = productDao.findById(86);
//		System.out.println(product.getId() + " | " + product.getProductName());

		// Order
		OrderDAO orderDao = new OrderDAO();
		orderDao.queryOrder();
		orderDao.createorderIfNotExist();
//		Order order = orderDao.findById(10358);
//		System.out.println(order.getId() + " | " + order.getStatus());
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter order customerId: ");
//		Integer customerId = input.nextInt(); //495
//		List<Order> orderbycId = orderDao.findOrderByCustomerId(customerId);
//		for ( Order o : orderbycId ) {
//			System.out.println(o.getId() + " | " + o.getCustomerId() + " | " + o.getOrderDate() + " | " + o.getStatus() + " | " + o.getComments());
//		}
//	
		
		// OrderDetails
		OrderDetailDAO orderDetailDao = new OrderDetailDAO();
		orderDetailDao.queryOrderDetail();
		//OrderDetail orderDetail = orderDetailDao.findById(51);
		//System.out.println(orderDetail.getId() + " | " + orderDetail.getQuantityOrdered());
		
		// Payment
//		PaymentDAO paymentDao = new PaymentDAO();
//		Payment payment = paymentDao.findById(129);
//		System.out.println(payment.getId() + " | " + payment.getAmount());
//		
//		CreateAndUpdateExample cuse = new CreateAndUpdateExample();
//		//cuse.insertCustomerExample();	
//		//cuse.updateCustomerExample();
//		cuse.listQuery();
		
	}

}
