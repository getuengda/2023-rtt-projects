package org.perscholas.database;

import org.perscholas.database.dao.OrderDAO;
import org.perscholas.database.dao.PaymentDAO;
import org.perscholas.database.entity.Order;
import org.perscholas.database.entity.Payment;

public class EqualExample {
	
	public static void main(String []args) {
		
		// By default .equals compare memory locations
		// to compare 
		
		OrderDAO orderDao = new OrderDAO();
		
		Order o1 = orderDao.findById(10100);
		Order o2 = orderDao.findById(10100);
		Order o3 = orderDao.findById(10101);
		
//		System.out.println(o1.getId() + " = " + o2.getId());
//		System.out.println(o1.equals(o2));
//		System.out.println(o1.equals(o3));
		
		PaymentDAO paymentDao = new PaymentDAO();
		
		Payment p1 = paymentDao.findById(103);
		Payment p2 = paymentDao.findById(103);
		Payment p3 = paymentDao.findById(104);
		
		System.out.println(p1.getId() + " = " + p2.getId());
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
		
	}

}
