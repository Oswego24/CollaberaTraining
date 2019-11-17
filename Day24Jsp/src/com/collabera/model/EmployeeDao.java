package com.collabera.model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Logger;

import com.mysql.cj.jdbc.Driver;

public class EmployeeDao {
	private static final Logger log = Logger.getLogger(EmployeeDao.class);
	static Connection conn = null;
	static {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/week5", "root", "root");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	private static HashMap<Integer, Employee> employeeMap =  new HashMap<Integer, Employee>();
	//ONLY FOR CREATING DATABASE HERE, RATHER THAN CONNECTING TO MYSQL
//		static {
//			for(int i=1; i<125; i++) {
//				employeeMap.put(i, new Employee(i, "Fname"+ i, "Lname"+i));
//				System.out.println("employeeMap size: " + employeeMap.size());
//			}
//		}
		public static List<Employee> getList(int pageNo, int pageSize) throws SQLException{
			List<Employee> list = new ArrayList<Employee>();
			PreparedStatement statement = JdbcUtils.getConnection().prepareStatement("SELECT * FROM employees LIMIT ?,?");
				statement.setInt(1, (pageNo-1)*pageSize);
				statement.setInt(2, pageSize);
			try {
				ResultSet rs = statement.executeQuery();
				while(rs.next()) {
					Employee e = resultSetToEmployee(rs);
					list.add(e);
				}
			}catch(SQLException e) {
				log.error(e.getMessage());
			}finally {
				if(statement!=null) 
					try {
						statement.close();
					
			}catch(SQLException e) {
				log.error(e.getMessage());
			}
		}return list;
		//PART OF CREATING THE DATABASE HERE RATHER THAN CONNECTING TO MYSQL
//			return employeeMap.entrySet()
//					.stream()
//					.skip((pageNo-1)*pageSize)
//					.limit(pageSize)
//					.map(Map.Entry::getValue)
//					.collect(Collectors.toList());
			
//			int fromIndex = (pageNo - 1)*pageSize + 1;
//			int toIndex = pageNo*pageSize - 1;
//			List<Employee> arrlist = new ArrayList<Employee>(employeeMap.values()); 
//			return arrlist.subList(fromIndex, toIndex); 
			
		}
		public static Employee insert(Employee emp) throws SQLException {
		
			if(emp==null) return null;
			PreparedStatement statement = JdbcUtils.getConnection().prepareStatement("INSERT INTO week5.employees(id, firstName, lastName)VALUES(?,?,?)");
					statement.setInt(1, emp.getId());
					statement.setString(2, emp.getFirstName());
					statement.setString(3, emp.getLastName());
				int count = 0;
			
				try {
					count = statement.executeUpdate();
				}catch(SQLException sqle) {
					log.error("Error executing insert for employee: " + emp);
				}finally {
					statement.close();
				}
				return emp;
//			return employeeMap.put(emp.getId(), emp);
//			boolean ret = false;
//			
//			if(!employeeMap.containsKey(emp.getId())) {
//				employeeMap.put(emp.getId(), emp);
//				ret = true;	
//			}
//			return ret;
		}

		public static List<Employee> getEmployee(int id) throws SQLException {
			List<Employee> list = new ArrayList<Employee>();
			PreparedStatement statement = JdbcUtils.getConnection().prepareStatement("SELECT * FROM employees");
			try {
				ResultSet rs = statement.executeQuery();
				while(rs.next()) {
					Employee e = resultSetToEmployee(rs);
					list.add(e);
				}
			}catch(SQLException e) {
				log.error(e.getMessage());
			}finally {
				if(statement!=null) 
					try {
						statement.close();
					
			}catch(SQLException e) {
				log.error(e.getMessage());
			}
			}
			return list;
		}
		private static Employee resultSetToEmployee(ResultSet rs) throws SQLException {
			Employee employee = new Employee();
			
			employee.setId(rs.getInt("id"));
			employee.setFirstName(rs.getString("firstName"));	
			employee.setLastName(rs.getString("lastName"));
		
			return employee;
		}
		
		public static Employee delete(Employee id) throws SQLException {
			if(id==null) {
				return id;
			}
			PreparedStatement statement = JdbcUtils.getConnection().prepareStatement("DELETE FROM week5.employees WHERE id = ?");
			statement.setInt(1, id.getId());
			int count = 0;
			try {
				count = statement.executeUpdate();
			}catch (SQLException sqle) {
				log.error("Error executing delete for employee " + id);
			}finally {
				statement.close();
			}
			return id;
//			return employeeMap.remove(id);
		}
//			boolean ret = false;
//			
//			if(employeeMap.containsKey(emp.getId())) {
//				employeeMap.remove(emp.getId(), emp);
//				ret = true;
//			}
//			return ret;
//		}
		public static int getTotalRecords() {
			return 0;
		}

}
