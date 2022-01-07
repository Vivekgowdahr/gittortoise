package pg.kumada.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Crud {
public static void main(String[] args) {
	Connection connection=null;
	Statement Statement=null;
	try {
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
	
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=Vivekgowda@1998");
		
		Statement = connection.createStatement();
		//Statement.execute("create table kumadha(id int,name varchar(40),rent double)");
		//boolean execute = Statement.execute("insert into kumadha values(1,'Vivek_Gowda',6000)");
		 Statement.execute("delete from kumadha where id=1");
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	finally {
		if (connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		if (Statement!=null) {
		try {
			Statement.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}	
		}
	}
}
}
