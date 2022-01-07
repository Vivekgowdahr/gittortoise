package pg.kumada.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertingUsingPreparedStm {
public static void main(String[] args) {
	Connection connection=null;
	PreparedStatement Statement=null;
	try {
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=Vivekgowda@1998");
		Statement = connection.prepareStatement("Insert into kumadha value(?,?,?)");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the id");
		int id= sc.nextInt();
		
		System.out.println("Enter the name of the roommate");
		String name= sc.next();
		
		System.out.println("Enter the cost");
		double cost = sc.nextDouble();
		
		Statement.setInt(1, id);
		
		Statement.setString(2, name);
		
		Statement.setDouble(3, cost);
		
		int executeUpdate = Statement.executeUpdate();
		System.out.println(executeUpdate);
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
}
}