package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertEmployeeUserInput {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");

		Statement statement = connection.createStatement();
		
		System.out.println("Enter employee Id: ");
		int employeeid=scan.nextInt();
		System.out.println("Enter employee Name: ");
		String employeename=scan.next();
		System.out.println("enter employee Age: ");
		int employeeage=scan.nextInt();
		System.out.println("Enter employee Salary: ");
		double employeesalary=scan.nextDouble();
		System.out.println("Enter employee Email: ");
		String employeeemail=scan.next();
		System.out.println("Enter employee Address: ");
		String employeeaddress=scan.next();
		statement.executeUpdate("insert into employee values('"+employeeid+"','"+employeename+"','"+employeeage+"','"+employeesalary+"','"+employeeemail+"','"+employeeaddress+"')");
		connection.close();
		
		
	}
}
