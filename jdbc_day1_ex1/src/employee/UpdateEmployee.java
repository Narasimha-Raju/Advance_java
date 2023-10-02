package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateEmployee {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
		
		Statement statement=connection.createStatement();
		
		//statement.execute("update employee set employeeemail='king01@gmail.com',employeeage=25 where employeesalary=25000");
		statement.execute("update employee set employeeemail='ram02@gmail.com',employeeage=24 where employeesalary=35000");
		connection.close();
		
		System.out.println("successfully Updated");
	}
}
 