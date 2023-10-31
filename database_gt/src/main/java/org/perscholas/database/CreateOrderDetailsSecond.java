package org.perscholas.database;

import java.util.List;
import java.util.Scanner;

import org.perscholas.database.dao.OrderDAO;
import org.perscholas.database.dao.OrderDetailDAO;
import org.perscholas.database.dao.ProductDAO;
import org.perscholas.database.entity.Order;
import org.perscholas.database.entity.OrderDetail;
import org.perscholas.database.entity.Product;

public class CreateOrderDetailsSecond {

	private OrderDAO orderDao = new OrderDAO();
	private ProductDAO productDao = new ProductDAO();
	private OrderDetailDAO orderDetailDao = new OrderDetailDAO();

	public void createOrderDetail() {
		Scanner input = new Scanner(System.in);

		// Ask the user to enter a partial product name
		System.out.println("Enter a partial product name to search: ");
		String partialProductName = input.next();

		// search and return products by name
		List<Product> products = productDao.findProductByName(partialProductName);
		
		if (products.isEmpty()) {
			System.out.println("No products found with the given name.");
			System.exit(1);
		} else {
			// List available products and let the user select a product ID:
			for (Product product : products) {
				System.out.println("Product id " + product.getId() + "|" + product.getProductName());
			}

		}

		// Enable the user select a product based on productId:
		System.out.println("Select a product Id: ");
		int productId = input.nextInt();

		// Find the selected product
		Product selectedProduct = productDao.findById(productId);

		// Check if that product is exist in db
		if (selectedProduct == null) {
			System.out.println("Invalid product ID");
			System.exit(1);
		} else {
			System.out.println("Selection of product successfull!");
		}

		// Ask the user for the order ID
		System.out.println("Enter the order ID to add the product: ");
		int orderId = input.nextInt();
		// Find the order by orderId
		Order order = orderDao.findById(orderId);
		if (order == null) {
			System.out.println("Invalid order ID");
			System.exit(1);
		}

		// Check if the the product is part of the orderDetails
		OrderDetail existingOrderDetail = orderDetailDao.findByorderIdAndproductId(orderId, productId);
		if (existingOrderDetail != null) {
			// product already part of he order, ask for quantity to add
			System.out.println("This product is already part of the order.");
			System.out.println("How many additional units would you like to order?");
			int additionalQuantity = input.nextInt();

			// Update the quantity ordered
			existingOrderDetail.setQuantityOrdered(existingOrderDetail.getQuantityOrdered() + additionalQuantity);
			orderDetailDao.save(existingOrderDetail);
		} else {
			// the product was not part of the order, hence create a new orderDetail
			OrderDetail newOrderDetail = new OrderDetail();
			newOrderDetail.setProduct(selectedProduct);
			newOrderDetail.setOrder(order);
			newOrderDetail.setOrderLineNumber(200);
			newOrderDetail.setPriceEach(7.77);

			System.out.println();

			System.out.println("Enter the quantity of the product to order: ");
			int quantity = input.nextInt();
			newOrderDetail.setQuantityOrdered(quantity);
			
			orderDetailDao.save(newOrderDetail);
			System.out.println("Successfully added new product to the order!");
			System.out.println("Your new quantity in order detail is: " + newOrderDetail.getQuantityOrdered());
		}

	}

	public static void main(String[] args) {
		CreateOrderDetailsSecond cods = new CreateOrderDetailsSecond();
		cods.createOrderDetail();
	}

}
