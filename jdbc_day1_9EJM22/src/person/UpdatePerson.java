package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatePerson {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Load and Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the Connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb", "root", "root");
		
		//Create the Statement
		Statement statement=connection.createStatement();
		
		//Execute the Statement
		statement.execute("Update person set personage=22,personaddress='Mattapalli' where personid=1");
		
		//close the Connection
		connection.close();
		
		System.out.println("successfully updated");
	}

}
