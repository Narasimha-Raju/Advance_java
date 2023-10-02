package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteEmployee {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
		
		Statement statement=connection.createStatement();		
		
		statement.execute("delete from employee where employeeaddress='Delhi'");
		
		connection.close();
		
		System.out.println("Successfully deleted");
		
		
	}
}
