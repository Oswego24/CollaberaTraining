package com.collabera.jdbcdemo.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {

	public static Connection getConnection() {
		Connection connect = null;
		
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("jdbc.properties"));
		}catch(FileNotFoundException e1) {
			e1.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}
		String user = prop.getProperty("user");
		String password = prop.getProperty("password");
		String dburl = prop.getProperty("dburl");
		
		try {
			connect = DriverManager.getConnection(dburl, user, password);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return connect;
	}
}
