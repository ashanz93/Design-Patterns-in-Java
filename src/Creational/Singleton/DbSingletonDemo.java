package Creational.Singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbSingleton instance = DbSingleton.getInstance();
		// Test code
		/*
		 * System.out.println(instance); DbSingleton anotherInstance =
		 * DbSingleton.getInstance(); System.out.println(anotherInstance);
		 */
		long timeBefore = 0;
		long timeAfter = 0;
		
		timeBefore = System.currentTimeMillis();
		Connection conn = instance.getConnection();
		timeAfter = System.currentTimeMillis();
		
		System.out.println(timeAfter - timeBefore);
		
		Statement statement;
		try {
			statement = conn.createStatement();
			String createstmt = "CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))";
			int count = statement.executeUpdate(createstmt);
			System.out.println("Table created");
			statement.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		// One connection shared. Time diff is zero as conn is already created. 
		timeBefore = System.currentTimeMillis();
		conn = instance.getConnection();
		timeAfter = System.currentTimeMillis();
		
		System.out.println(timeAfter - timeBefore);
	}

}
