package mobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateMobile {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String classname="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mobiledb";
		String username = "root";
		String password = "root";
		String query="update mobile set mobileprice=?,mobilecolour=?,mobilestorage=? where mobileid=?";

		
		System.out.println("Enter the price to be Updated");
		double price=scan.nextDouble();
		System.out.println("Enter the colour to be Updated");
		String colour=scan.next();
		System.out.println("Enter the storage to be Updated");
		int storage=scan.nextInt();
		System.out.println("Enter the id");
		int id=scan.nextInt();
		
		
		// Load and Register the Driver
		Class.forName(classname);
		// Establish the Connection
		Connection connection = DriverManager.getConnection(url, username, password);
		// Create the Statement
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setDouble(1, price);
		preparedStatement.setString(2, colour);
		preparedStatement.setInt(3, storage);
		preparedStatement.setInt(4, id);
		
		//Execute the Statement
		preparedStatement.execute();
		//Close the connection
		connection.close();
		
		System.out.println("successfully Updated");

	}

}
