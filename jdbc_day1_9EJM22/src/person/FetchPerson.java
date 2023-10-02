package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchPerson {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Load and Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Establish the Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb", "root", "root");

		// Create the Statement
		Statement statement = connection.createStatement();

		// Execute the statement
		ResultSet resultSet=statement.executeQuery("Select * from person ");
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getInt(3));
			System.out.println(resultSet.getString(4));
			System.out.println(resultSet.getLong(5));	
			System.out.println();
		}

		// Close the Connection
		connection.close();


	}
}
