package com.collabera.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component
public class ConnectionManager {
	String connectionString = "jdbc:mysql://localhost:3306/todo";
	String username="root";
	String password="root";

	Connection myConn;
	
	public ConnectionManager() throws SQLException {
		super();
		myConn = DriverManager.getConnection(connectionString, username, password);
		System.out.println("Connection Successful");
	}
	public Connection getMyConn() throws SQLException {
		if(myConn!=null) {
			return myConn;
		}else {
			try {
				myConn = DriverManager.getConnection(connectionString, username, password);
				return myConn;
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
		
	}
}

