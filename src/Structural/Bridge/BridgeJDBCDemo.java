package Structural.Bridge;

import java.sql.*;

public class BridgeJDBCDemo {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
			
			String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
			
			Connection conn = DriverManager.getConnection(dbUrl);
			// Abstraction against the actual driver
			Statement sta = conn.createStatement();
			
			sta.executeUpdate("create table address (ID int, StreetName VARCHAR(20), City VARCHAR(20))");
			System.out.println("Table created");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
