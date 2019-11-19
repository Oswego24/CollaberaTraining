package com.collabera;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeApp {

	public static void main(String[] args) {
		Connection connect = null;
		try {
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/week5");
			System.out.println("Connection Successful");
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
