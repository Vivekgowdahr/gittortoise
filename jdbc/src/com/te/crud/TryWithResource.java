package com.te.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TryWithResource {
public static void main(String[] args) {
	try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=Vivekgowda@1998"); 
	Statement stmt=con.createStatement();)	{
		boolean execute = stmt.execute("select*from sweet");
		System.out.println(execute);
	} catch (Exception e) {
e.printStackTrace();
	}
}
}
