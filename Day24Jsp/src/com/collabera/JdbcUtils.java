package com.collabera;

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
		
		//USED FOR READING FROM FIS jdbc.properties.
//		Properties prop = new Properties();
//		try {
//			prop.load(new FileInputStream("jdbc.properties"));
//		}catch(FileNotFoundException e1) {
//			e1.printStackTrace();
//		}catch(IOException e1) {
//			e1.printStackTrace();
//		}
//		String user = prop.getProperty("user");
//		String password = prop.getProperty("password");
//		String dburl = prop.getProperty("dburl");
//		
		try {
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/week5", "root", "root");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return connect;
	}
}
