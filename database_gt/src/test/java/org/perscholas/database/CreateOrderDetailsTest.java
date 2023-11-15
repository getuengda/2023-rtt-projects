package org.perscholas.database;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.perscholas.database.dao.OrderDetailDAO;
import org.perscholas.database.entity.OrderDetail;

public class CreateOrderDetailsTest {

	private OrderDetailDAO orderDetailDao = new OrderDetailDAO();
	private OrderDetailDAO orderDetailDAO;

	@Test
	public void findOrderById() {

		int orderDetailId = 1; // Change this to the expected OrderDetail ID

		OrderDetail orderDetail = orderDetailDao.findById(orderDetailId);

		// Assert that the actual OrderDetail ID matches the expected OrderDetail ID
		Assertions.assertEquals(orderDetailId, orderDetail.getId());

	}

}
