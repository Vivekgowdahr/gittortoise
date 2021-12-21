package com.te.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		Savepoint setSavepoint = null;
		try {
			connection = DriverManager.getConnection(url, "root", "Vivekgowda@1998");
			statement = connection.createStatement();
			connection.setAutoCommit(false);
			statement.execute("insert into values('1,unlocking by fingerprint')");
			statement.execute("insert into values('2,Entering the pin')");
			statement.execute("insert into values('3,check balance')");
			System.out.println("balance is 10000000");
			setSavepoint = connection.setSavepoint();
			statement.execute("insert into values('4,debeting the amount')");
			statement.execute("insert into values('5,transfer through network')");
			statement.execute("insert into values('6,creaditing the amount')");
			System.out.println("Transaction completed! Tinding!!");
			connection.commit();
		} catch (SQLException e) {
			try {
				if (setSavepoint!=null) {
				connection.rollback(setSavepoint);
				connection.commit();
				}} catch (SQLException e1) {
				}
			System.out.println("Transation failed!");

		}

	}
}
