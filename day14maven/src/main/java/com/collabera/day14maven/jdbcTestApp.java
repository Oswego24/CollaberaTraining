package com.collabera.day14maven;

import java.sql.*;

public class jdbcTestApp {

	public static void main(String[] args) {

		Connection connect = null;
		try {
			connect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
			if(connect!=null) {
				System.out.println("MySQL connection successfully acquired!");
			}
			String sql = "select * from city";
			PreparedStatement stmt = connect.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}
			rs.close();
			connect.close();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
