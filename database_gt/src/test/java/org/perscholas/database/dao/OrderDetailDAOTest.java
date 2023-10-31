package org.perscholas.database.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.perscholas.database.entity.OrderDetail;

public class OrderDetailDAOTest {
	
	private OrderDetailDAO orderDetailDao = new OrderDetailDAO();

	@Test
	public void findOrderById() {

		int orderDetailId = 10108; // Change this to the expected OrderDetail ID

        OrderDetail orderDetail = orderDetailDao.findById(orderDetailId);

        // Assert that the actual OrderDetail ID matches the expected OrderDetail ID
        Assertions.assertEquals(orderDetailId, orderDetail.getId());

	}

}
