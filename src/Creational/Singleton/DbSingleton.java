package Creational.Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.derby.jdbc.*;

public class DbSingleton {
	// Instance remains singleton irrespective of JVM changes
	// Never cached. Reads and writes done from main memory
	// Ensures thread safety
	private static volatile DbSingleton instance = null;
	private static volatile Connection conn = null;
	
	private DbSingleton() {
		// Cannot use reflection to create instance
		/*
		 * if(instance != null) { throw new
		 * RuntimeException("Use getIsntance() to create"); }
		 */
		try {
			DriverManager.registerDriver(new EmbeddedDriver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(conn != null) {
			throw new RuntimeException("Use getConnection() to create");
		}
		
		if(instance != null) {
			throw new RuntimeException("Use getInstance() to create");
		}
	}
	
	public static DbSingleton getInstance() {
		// Lazy load - create instance when needed
		if(instance == null) {
			// Thread safe
			synchronized (DbSingleton.class) {
				if(instance == null) {
					instance = new DbSingleton();
				}
			}
		}
		return instance;
	}
	
	public Connection getConnection() {
		if(conn == null) {
			synchronized (DbSingleton.class) {
				if(conn == null) {
					try {
						String dburl = "jdbc:derby:memory:codejava/webdb;create=true";
						conn = DriverManager.getConnection(dburl);
					} catch(SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return conn;
	}
}
