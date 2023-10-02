package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertEmployee {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
				
		Statement statement=connection.createStatement();
		
		//statement.execute("insert into employee values(1,'KING',28,20000,'king@gmail.com','Delhi')");
		//statement.execute("insert into employee values(2,'SCOTT',27,25000,'scott@gmail.com','Bangloor')");
		//statement.execute("insert into employee values(3,'FORD',30,30000,'ford@gmail.com','Mumbai')");
		//statement.execute("insert into employee values(4,'RAJU',23,40000,'raju@gmail.com','Hyderabad')");
		statement.execute("insert into employee values(5,'RAM',22,40000,'ram@gmail.com','Hyderabad')");
		connection.close();
		
		System.out.println("successfully inserted");
	}
}
