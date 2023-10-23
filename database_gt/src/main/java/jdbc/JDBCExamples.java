package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExamples{

	public static void main(String[] args) throws SQLException{
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "root";
		
		String query1 = "select * from employees";
		String query2 = "select id, firstname, lastname,email, job_title from employees where id = 1625";
		String query3 = "select id, firstname, lastname,email, job_title from employees where job_title='Sales Rep'";
	
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // optional
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(dburl, user, password);
			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery(query3);
			
			while(result.next()) {
				String EmployeeData = "";
				for(int i = 1; i <= 5; i++) {
					EmployeeData += result.getString(i) + ":";
				}
				System.out.println(EmployeeData);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
