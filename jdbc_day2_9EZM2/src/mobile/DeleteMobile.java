package mobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteMobile {
	
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		String classname="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mobiledb";
		String username = "root";
		String password = "root";
		String query="delete from mobile where mobileid=?";

		
		System.out.println("Enter the id wants to delete");
		int id=scan.nextInt();
		
		
		// Load and Register the Driver
		Class.forName(classname);
		// Establish the Connection
		Connection connection = DriverManager.getConnection(url, username, password);
		// Create the Statement
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		
		preparedStatement.setInt(1, id);
		
		//Execute the Statement
		preparedStatement.execute();
		//Close the connection
		connection.close();
		
		System.out.println("successfully Deleted");
		
	}

}
