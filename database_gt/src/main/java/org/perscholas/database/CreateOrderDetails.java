package org.perscholas.database;

import java.util.List;
import java.util.Scanner;

import org.perscholas.database.dao.OrderDAO;
import org.perscholas.database.dao.OrderDetailDAO;
import org.perscholas.database.dao.ProductDAO;
import org.perscholas.database.entity.Order;
import org.perscholas.database.entity.OrderDetail;
import org.perscholas.database.entity.Product;

public class CreateOrderDetails {

	private OrderDAO orderDao = new OrderDAO();
	private ProductDAO productDao = new ProductDAO();
	private OrderDetailDAO orderDetailDao = new OrderDetailDAO();

	public void createOrderDetails() {

		// ask the user to enter a product name
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a product name to add to your order: ");
		String productName = input.nextLine();

		// looks up a product by a productName
		List<Product> products = productDao.findByName(productName);

//		if (products.size() == 0) {
//			System.out.println("You did not enter a valid proper product name");
//			System.exit(0);
//		}
		if (products.isEmpty()) {
			System.out.println("No products found with the given name.");
			return;
		}
		// LIST THE PRODUCT THAT WERE FOUND
		System.out.println("Available Products are:");
		// the query for product name can return more than one product
		// with the same name
		// so we list the products that were returned
		for (Product product : products) {
			System.out.println("Product id " + product.getId() + " | " + product.getProductName());
		}

		// ASK THE USER TO SELECT A product Id
		// of the list of of product names that we show let the user select
		// the id that they want to add
		System.out.println("Select a product Id:");
		int productId = input.nextInt();

		// FIND THE SELECTED PRODUCTS
		// the goal is to insert a record into the order details table
		Product selectedProduct = productDao.findById(productId);
		if (selectedProduct == null) {
			System.out.println("Invalid product Id.");
			return;
		}

		// Ask the user what order number they want to add the product to
		System.out.println("Enter the order ID to add the product:");
		int orderId = input.nextInt();

		// Find the order
		Order o = orderDao.findById(orderId);

		if (o == null) {
			System.out.println("Invalid order ID.");
			return;
		}
		// ask the user what order number they want to add the product too
		// Order o = orderDao.findById(10100);

		// if the product is already part of the order do not add it again
//		for (OrderDetail orderDetail : o.getOrderdetail()) {
//			if (orderDetail.getProduct().getId() == productId) {
//				// the product is already part of the order
//				System.out.println(
//						"The product " + p.getProductName() + " is already part of the order. can not add again");
//				System.exit(1);
		// Check if the product is already part of the order
		// if the product is already part of the order replay cannot add again
		boolean productExistsInOrder = o.getOrderdetail().stream()
				.anyMatch(orderDetail -> orderDetail.getProduct().getId() == productId);

		if (productExistsInOrder) {
			System.out.println("The product " + selectedProduct.getProductName()
					+ " is already part of the order. Cannot add again.");
		} else {
			OrderDetail od = new OrderDetail();
			od.setProduct(selectedProduct);
			od.setOrder(o);
			od.setOrderLineNumber(200);
			od.setPriceEach(5.55);
			od.setQuantityOrdered(300);

			orderDetailDao.save(od);
			System.out.println("Successfully added product to order");
		}
		
	}


	public void getOrderAndProductFromOrderDetails() {
		// the goal is to get a record from the order details table
		Product p = productDao.findById(1);
		Order o = orderDao.findById(10100);

		OrderDetail od = new OrderDetail();
		od.getProduct();
	}

	public static void main(String[] args) {
		CreateOrderDetails cod = new CreateOrderDetails();
		cod.createOrderDetails();

	}

}
