package com.te.crud;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class Batchstatement {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/jdbcdemo";
	FileReader fileReader;
	Connection connection =null;
	Statement statement =null;
	try {
		fileReader=new FileReader("C:\\Users\\admin\\Desktop\\dbcred.txt");
		Properties properties = new Properties();
		properties.load(fileReader);
		connection = DriverManager.getConnection(url,properties);
		statement = connection.createStatement();
		statement.addBatch("update employe set name='manju' where id=101");
		statement.addBatch("insert into employees values(103,'rashmika mandana)");
		statement.executeBatch();
		
	} catch (Exception e) {
e.printStackTrace();	}
}
}
