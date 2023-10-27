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

		// TODO make the product name work with like .. so I Can enter a partial product
		// name
		// looks up a product by a productName
		List<Product> products = productDao.findProductByName(productName);

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
		// the query for product name can return more than one product with the same
		// name
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
		// TODO this should another check here to make sure that they product loaded is
		// a product
		Product selectedProduct = productDao.findById(productId);
		if (selectedProduct == null) {
			System.out.println("Invalid product Id.");
			System.exit(1);
		}

		// Ask the user what order number they want to add the product to
		System.out.println("Enter the order ID to add the product:");
		int orderId = input.nextInt();

		// TODO add the ability to ask the user for an order number
		// Find the order
		Order o = orderDao.findById(orderId);

		// TODO if the order is null then print a message saying invalid order number
		if (o == null) {
			System.out.println("Invalid order ID.");
			System.exit(1);
		}

		// TODO .... if the product is already part of the order details -
		// ask the user what order number they want to add the product too
		// Check if the product is already part of the order
		// if the product is already part of the order replay cannot add again
		for (OrderDetail orderDetail : o.getOrderdetail()) {
			if (selectedProduct.getId().equals(orderDetail.getProduct().getId())) {
				System.out.println("The product " + selectedProduct.getProductName()
						+ " is already part of the order. Cannot add again.");
				System.exit(1);
		// because it required not null, we know that this product is already part of
		// the order
			}
			OrderDetail queryOd = orderDetailDao.findByorderIdAndproductId(orderId, productId);
			System.out.print("======> should not be null " + queryOd);
		 if (queryOd != null) {
				System.out.print("This product is alreay part of the order. Cannot add again!");
			}
		// If not I would increment the quantity ordered
		 if (queryOd == null) {
			int quantity = input.nextInt();
			queryOd.setQuantityOrdered(queryOd.getQuantityOrdered() + quantity);
			orderDetailDao.save(queryOd);
		 }
//		 if (queryOd == null) {
//				System.out.print("Enter the amount of quantity you want to oerder: ");
//				int quantity = input.nextInt();
//				while (quantity > 1) {
//					for (int i = 0; i <= quantity; i++) {
//						
//						queryOd.setQuantityOrdered(queryOd.getQuantityOrdered() + quantity);
//						orderDetailDao.save(queryOd);
//						input.hasNext();
//					}
//				}
//
//			}
//		boolean productExistsInOrder = o.getOrderdetail().stream()
//				.anyMatch(orderDetail -> orderDetail.getProduct().getId() == productId);
//
//		if (productExistsInOrder) {
//			System.out.println("The product " + selectedProduct.getProductName()
//					+ " is already part of the order. Cannot add again.");
//		} 
			else {
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

	}

	public void getOrderAndProductFromOrderDetails() {
		// the goal is to get a record from the order details table
		Product p = productDao.findById(1);
		Order o = orderDao.findById(10100);

		OrderDetail od = new OrderDetail();
		od.getProduct();
		od.getOrder();
	}

	public static void main(String[] args) {
		CreateOrderDetails cod = new CreateOrderDetails();
		cod.createOrderDetails();

	}

}
