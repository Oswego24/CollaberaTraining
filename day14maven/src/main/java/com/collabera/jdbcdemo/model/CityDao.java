package com.collabera.jdbcdemo.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

public class CityDao {
	private static final Logger log = Logger.getLogger(CityDao.class.getName());
	private static HashMap<Integer, City> cache =  new HashMap<Integer, City>();
    
	public City findById(Integer id) throws FileNotFoundException, IOException, SQLException {
		if(cache.containsKey(id)) {
			return cache.get(id);
		}
		List<City> list = find("WHERE id = " + id);
		return list.get(0);
	}
	private List<City> find(String query) throws FileNotFoundException, IOException, SQLException {
		// FIND METHOD
	    Properties prop = new Properties();
	    prop.load(new FileInputStream("jdbc.properties"));
	    
	    String user = prop.getProperty("user");
	    String password = prop.getProperty("password");
	    String dburl = prop.getProperty("dburl");
	    
		List<City> list = new ArrayList<City>();
		Statement stmt = DriverManager.getConnection(dburl, user, password).createStatement();
		String sqlquery = "SELECT * FROM city c " + query; 
		
		try {
			log.debug("exectuting query: " + sqlquery);
			ResultSet rs = stmt.executeQuery(sqlquery);
			while(rs.next()) {
				City c = resultSetToCity(rs);	
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

	private City resultSetToCity(ResultSet rs) throws FileNotFoundException, IOException, SQLException {
		//Convert ResultSet to City object
		City city = null;
		
		Integer id = rs.getInt("id");
		//is this city already in cache? If so, use it
		if(cache.containsKey(id)) {
			city = cache.get(id);
		}else {
			city = new City();
		}
		city.setId(id);
		city.setName(rs.getString("Name"));
		city.setDisctrict(rs.getString("District"));
		city.setPopulation(rs.getInt("Population"));
		city.setCountryCode(rs.getString("CountryCode"));
		//String countryCode = rs.getString("Country Code");
		// Add this city to the cache
		if(!cache.containsKey(id)) {
			cache.put(id, city);
		}// Now get reference to the country this city refers
		log.info("Get country for city " + city.getName());
		//Country country = countryDao.findById(countryCode);
		//city.setCountry(country)
		
		return city;
	}
	public List<City> findByName(String name) throws FileNotFoundException, IOException, SQLException{
		name = sanatize(name);
		List<City> list = find("WHERE name = '" + name + "'");
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
}
