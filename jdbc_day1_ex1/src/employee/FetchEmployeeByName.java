package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchEmployeeByName {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
		
		Statement statement=connection.createStatement();
		
		ResultSet resultSet=statement.executeQuery("select * from employee where employeename='raju'");
		
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getInt(3));
			System.out.println(resultSet.getDouble(4));
			System.out.println(resultSet.getString(5));
			System.out.println(resultSet.getString(6));
			System.out.println();
		}
		connection.close();
		
		
	}
}
