package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertPerson {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Load and Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb", "root", "root");
		
		//Create the Statement
		Statement statement=connection.createStatement();
		
		//Execute the Statement
		statement.execute("insert into person values(6,'king',24,'Delhi',6923059232)");
		
		//Close the Connection
		connection.close();
		
		System.out.println("successfully inserted into DataBase");
	}
}
