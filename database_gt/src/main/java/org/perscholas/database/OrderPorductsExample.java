package org.perscholas.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class OrderPorductsExample {
	
	public static void main(String[] args) throws SQLException {
		// 1) Create a connection to the database classicmodels
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "root";
		
		Connection connection = null;
			// 2) Use the scanner to take input of an order number
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // optional
			connection = DriverManager.getConnection(dburl, user, password);
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter an order number :");
			int orderNumber = scanner.nextInt();
			System.out.println("Enter an product id :");
			int product_id = scanner.nextInt();
			System.out.println("Enter an product name :");
			String product_name = scanner.nextLine();
			

			// 3) Write a query using a prepared statement to print out the product_id, product name, 
			String sql = "SELECT * FROM order WHERE product_id = ? and product_name = ?";
			System.out.println(sql);			
			
			// this is the secure way of creating a query
			PreparedStatement stmt = connection.prepareStatement(sql);
			// the first ? in the query is position 1
			stmt.setInt(1, orderNumber);
			stmt.setInt(2, product_id);
			stmt.setString(3, product_name);

			// in this line of code we are not going to pass in the SQL because we have already 
			// passed it into the prepared statement
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				Integer id = result.getInt("id");
				int orderId = result.getInt(120);
				int productId = result.getInt(44);
				String productName = result.getString("laptop computer");
				System.out.println(id + " | " + orderId + " | " + productId + " | " + productName);
			}

			result.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
			}
		}
		
		
		//    quantity ordered, msrp, buy_price, margin (msrp-buy_price), and total margin (margin * quantity ordered)
		// try to make the output look nice
		
		// DOUBLE BONUS
		// 4) use a java variable to calculate the total margin for the entire order (all products) 
		
	}
	

}
