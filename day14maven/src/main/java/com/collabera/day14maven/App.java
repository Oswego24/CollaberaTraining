package com.collabera.day14maven;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.collabera.jdbcdemo.model.City;
import com.collabera.jdbcdemo.model.CityDao;
import com.collabera.jdbcdemo.model.Country;
import com.collabera.jdbcdemo.model.CountryDao;
import com.collabera.jdbcproject.model.Department;
import com.collabera.jdbcproject.model.Employee;
import com.collabera.jdbcproject.model.EmployeeDao;

import java.util.List;

public class App {
	static Logger log = Logger.getLogger(App.class.getName());
    public static void main(String[] args) throws IOException {
//    	log.debug("Hello World");
//    	log.info("JDBC Test App Started");
//        Properties prop = new Properties();
//        prop.load(new FileInputStream("jdbc.properties"));
//        
//        String user = prop.getProperty("user");
//        String password = prop.getProperty("password");
//        String dburl = prop.getProperty("dburl");
//        
//		Connection connect = null;
//		try {
//			connect = (Connection) DriverManager.getConnection(dburl, user, password);
//			if(connect!=null) {
//				System.out.println("MySQL connection successfully acquired!");
//			}
//			String sql = "select * from city";
//			PreparedStatement stmt = connect.prepareStatement(sql);
//			ResultSet rs = stmt.executeQuery();
//			while(rs.next()) {
//				log.debug(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
//			}
//			
//		}catch(SQLException ex) {
//			log.error(ex.getMessage());
//			//System.out.println(e.getMessage());
//		}
    	
    	
//		log.info("Testing CityDao...");
//		CityDao cityDao= new CityDao();
//		try {
//			List<City> cities = cityDao.findByName("Miami");
//			if(cities.size() > 0) {
//				log.info(cities.get(0));
//			}
//		}catch (Exception e) {
//			log.error(e.getMessage());
//		}
//		
    	
    	
//		log.info("Testing CountryDao...");
//		CountryDao countryDao = new CountryDao();
//		try {
//			List<Country> countries = countryDao.findByName("Japan");
//			if(countries.size() > 0) {
//				log.info(countries.get(0));
//			}
//		}catch (Exception e) {
//			log.error(e.getMessage());
//		}
		
//    	CountryDao countryDao = new CountryDao();
    	
//		try {
//			String code = "abc";
//			boolean delete = countryDao.delete(code);
//			log.info("Delete country " + code + ": " + delete);
//		}catch(Exception x) {
//			log.error(x.getMessage());
//		}
		
//		try {
//			Country country = new Country();
//			country.setCode("AAA");
//			country.setName("Asia");
//			country.setContinent("Asia");
//			country.setRegion("WWW");
//			boolean success = countryDao.insert(country);
//			
//			if(success) {
//				log.info("Success inserting country: " + country);
//			}
//		}catch(Exception e) {
//			log.error(e.getMessage());
//		}
    	
    	Employee employee = new Employee();
    	EmployeeDao	employeeDao = new EmployeeDao();
    	
//    	try {
//    		List<Employee> list = getAllEmployees();
//    		System.out.println(list);
//    	}catch(Exception e) {
//    		log.error(e.getMessage());
//    	}
    	try {
    		employee.setId(3);
    		employee.setFirstName("Bob");
    		employee.setLastName("Smith");
    		employee.setDepartment(Department.ACCOUNTING);
    		boolean success = employeeDao.insert(employee);
    		
    		if(success) {
    			log.info("Success inserting employee: " + employee);
    		}
    	}catch(Exception e) {
    		log.error(e.getMessage());
    	}
			
    	try {
			int id = 1;
			boolean delete = employeeDao.delete(id);
			log.info("Delete employee " + id + ": " + delete);
		}catch(Exception x) {
			log.error(x.getMessage());
		}
    	
    	try {
    		List<Employee> list = employeeDao.getAllEmployees();
    		System.out.println(list);
    	}catch(Exception e) {
    		log.error(e.getMessage());
    	}
    }
}
