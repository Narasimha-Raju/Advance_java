package mobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMobile {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		String url="jdbc:mysql://localhost:3306/mobiledb";
		String username="root";
		String password="root";
		
		System.out.println("Enter the id");
		int id=scan.nextInt();
		System.out.println("Enter the Brand");
		String brand=scan.next();
		System.out.println("Enter the price");
		double price=scan.nextDouble();
		System.out.println("Enter the colour");
		String colour=scan.next();
		System.out.println("Enter the storage");
		int storage=scan.nextInt();
		
		
		//Load and Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Establish the Connection
		Connection connection=DriverManager.getConnection(url, username, password);
		//Create the Statement
		PreparedStatement preparedStatement=connection.prepareStatement("insert into mobile values(?,?,?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, brand);
		preparedStatement.setDouble(3, price);
		preparedStatement.setString(4, colour);
		preparedStatement.setInt(5, storage);
		//Execute the Statement
		preparedStatement.execute();
		//Close the Connection
		connection.close();
		System.out.println("Successfully Inserted");
		
	}

}
