package com.collabera.jdbcdemo.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

public class CountryDao {
	private static final Logger log = Logger.getLogger(CountryDao.class);

	private List<Country> find(String query) throws FileNotFoundException, IOException, SQLException {
	    
		List<Country> list = new ArrayList<Country>();
		Statement stmt = JdbcUtils.getConnection().createStatement();
//		PreparedStatement pstmt = JdbcUtils.getConnection()
//				.prepareStatement("SELECT * FROM Country WHERE name = ?");
//		pstmt.setString(1, "Thialand");
		String sqlquery = "SELECT * FROM country c " + query; 
		
		try {
			log.debug("exectuting query: " + sqlquery);
			ResultSet rs = stmt.executeQuery(sqlquery);
			while(rs.next()) {
				Country c = resultSetToCountry(rs);	
				list.add(c);
			}
		}catch(SQLException sqle) {
			log.error("Error Executing: " + sqlquery, sqle);
		}finally {
			if(stmt!=null) {
				try {
					stmt.close();
				}catch(SQLException e) {
					/*ignore it */
				}
			}
		}
		return list;
	}

	private Country resultSetToCountry(ResultSet rs) throws FileNotFoundException, IOException, SQLException {
		//Convert ResultSet to City object
		Country country = new Country();
		
		country.setCode(rs.getString("Code"));
		country.setName(rs.getString("Name"));
		country.setContinent(rs.getString("Continent"));
		country.setRegion(rs.getString("Region"));
	
		return country;
	}
	public List<Country> findByName(String name) throws FileNotFoundException, IOException, SQLException{
		name = sanatize(name);
		List<Country> list = find("WHERE name = '" + name + "'");
		return list;
	}
	private String sanatize(String string) {
		if(Pattern.matches("[a-zA-Z]", "")) {
		//if(string!="[a-zA-Z]") {
			//return "Alphanumeric characters only"
			return string;
		}else {
			string.replace("[a-zA-Z]", "");
			return string;
		}
		
	}
	//Deleting a table entry in MYSql by code
	public boolean delete(String code) throws SQLException {
		if(code==null) {
			return false;
		}
		PreparedStatement statement = JdbcUtils.getConnection().prepareStatement("DELETE FROM Country WHERE name = ?");
		statement.setString(1, code);
		int count = 0;
		
		if(statement==null) return false;

		try {
			count = statement.executeUpdate();
		}catch (SQLException sqle) {
			log.error("Error executing delete for code " + code);
		}finally {
			statement.close();
		}
		return count>0;
	}
	//Inserting a table entry to MYSQL
	public boolean insert(Country country) throws SQLException{
		if(country==null) return false;
		PreparedStatement statement = JdbcUtils.getConnection().prepareStatement("INSERT INTO country(code, name, continent, region)VALUES(?,?,?,?)");
				statement.setString(1, country.getCode());
				statement.setString(2, country.getName());
				statement.setString(3, country.getContinent());
				statement.setString(4, country.getRegion());
			int count = 0;
			try {
				count = statement.executeUpdate();
			}catch(SQLException sqle) {
				log.error("Error executing insert for country: " + country);
			}finally {
				statement.close();
			}
			return count > 0;
	}
}
