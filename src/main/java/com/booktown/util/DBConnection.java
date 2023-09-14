package com.booktown.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static Connection connection;
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER_NAME = "booktown";
	private static final String PASSWORD = "root";
	public static Connection getConnection() throws ClassNotFoundException {
		try {
				Class.forName("oracle.jdbc.driver.OracleDriver"); 
				connection = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
