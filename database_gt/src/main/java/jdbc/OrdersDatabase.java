package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Statement;


public class OrdersDatabase {
	
	//Add one static reference db connection 
	private static Connection con = null;
	public static Scanner scanner = new Scanner(System.in); 
	
	public static void main(String[] args) {
		//let's create OrderDatabase obj to call the method we created 
		//or to access our new method created bellow main method
		OrdersDatabase orderDatabase = new OrdersDatabase();
		
		String dburl = "jdbc:mysql://localhost:3306/get-orders";
		String user = "root";
		String password = "root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // register the driver
			con = DriverManager.getConnection(dburl, user, password); // And assign this to our local connection referenc
			
			// Let's work on Insert new data to our table
			System.out.println("Enter order: ");
			System.out.println("1. Insert order");
			System.out.println("2. Select order");
			int order = Integer.parseInt(scanner.nextLine());
			
			switch(order) {
			case 1: 
				orderDatabase.insertOrder();
				break;
			case 2: 
				orderDatabase.selectOrder();
				break;	
				default:
					break;
			}
		}catch(Exception e) {
			e.printStackTrace();
			//throw new RuntimeException("Something went wrong");
		}

	}
	private void insertOrder() throws SQLException{
		// This is inserting static value
		String sql = "insert into neworders (id,order_name,order_type,order_by,status) values(101, 'Toshiba', 'laptop', 'getas','Shipped')";
		String sql2 = "insert into neworders (order_name,order_type,order_by,status) values('Toshiba202', 'laptop', 'Metas','In Progress')";
		String sql3 = "insert into neworders (order_name,order_type,order_by,status) values(?,?,?,?)";
		
		// For our sql operation we can use PreparedStatement which is an object that represents a pre-compiled SQL statement. 
		// A SQL statement is pre-compiled and stored in a PreparedStatement object. 
		// This object can then be used to efficiently execute this statement multiple times. 
		
		PreparedStatement preparedStatement = con.prepareStatement(sql3);
		//get input from the user
		System.out.println("Enter order name:");
		preparedStatement.setString(1, scanner.nextLine());
		
		System.out.println("Enter order type:");
		preparedStatement.setString(2, scanner.nextLine());
		
		System.out.println("Enter order by:");
		preparedStatement.setString(3, scanner.nextLine());
		
		System.out.println("Enter status:");
		preparedStatement.setString(4, scanner.nextLine());
		//Insert dynamic value
				//		preparedStatement.setString(1, "MacPro");
				//		preparedStatement.setString(2, "Laptop");
				//		preparedStatement.setString(3, "Jhon");
				//		preparedStatement.setString(4, "In Progress");
		
		//Next is to execute our query check the row count for SQL Data Manipulation
		// Executes the SQL statement in this PreparedStatement object,which must be an SQL Data Manipulation Language (DML) statement, such as INSERT, UPDATE or DELETE; or an SQL statement that returns nothing,such as a DDL statement.
			//Returns:either (1) the row count for SQL Data Manipulation Language (DML) statements or 
			//(2) 0 for SQL statements that return nothing
		int rows = preparedStatement.executeUpdate();
		// if above is successful let's check and do the following
		if(rows > 0) {
			System.out.println("New Orders inserted successfully.");
		}
		}
		// second operation select from table
		public void selectOrder() throws SQLException{
			System.out.println("Select order is called");
			String sql = "select * from neworders where order_type = 'laptop'";
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery(sql);
			
			while(result.next()) {
				// order_name,order_type,order_by,status
				String orderName = result.getString("order_name");
				String orderName2 = result.getString("order_name");
				String orderType = result.getString("order_type");
				System.out.println();
				
			}
			
	}
	
}
