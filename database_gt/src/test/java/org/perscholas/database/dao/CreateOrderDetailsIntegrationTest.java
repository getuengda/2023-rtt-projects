package org.perscholas.database.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.ByteArrayInputStream;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;

import org.perscholas.database.CreateOrderDetails;
import org.perscholas.database.entity.Order;
import org.perscholas.database.entity.OrderDetail;
import org.perscholas.database.entity.Product;


@Transactional // Rollback transactions after each test
public class CreateOrderDetailsIntegrationTest {
	
    private CreateOrderDetails orderDetailsCreator;


    private OrderDAO orderDao;


    private ProductDAO productDao;


    private OrderDetailDAO orderDetailDao;
   
    @Test
    public void testFindOrderDetailById(){	
    	// Create and persist a sample product and order in the database
    	Product product = new Product();
    	product.setId(1);
    	product.setProductName("ford");
    	productDao.save(product);
    	
    	Order order = new Order();
    	order.setId(10104);
    	orderDao.save(order);
    	
    	//provide user input (simulate user input)
    	ByteArrayInputStream input = new ByteArrayInputStream("1\n10104\n300".getBytes());
    	
    	// call the method to test
    	orderDetailsCreator.createOrderDetails();
    	
    	// Retrieve the created order detail from the database
    	OrderDetail createdOrderDetail = orderDetailDao.findById(10104);
    	
    	// assert that the order detail was created as expected
    	assertNotNull(createdOrderDetail);
    	assertEquals(300, createdOrderDetail.getQuantityOrdered());
    }
}
