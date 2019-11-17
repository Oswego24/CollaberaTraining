package com.collabera.jdbcproject.model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import org.apache.log4j.Logger;


import com.collabera.jdbcdemo.model.JdbcUtils;

public class EmployeeDao {

	private static final Logger log = Logger.getLogger(EmployeeDao.class);
	private static HashMap<Integer, Employee> cache =  new HashMap<Integer, Employee>();

	public List<Employee> getAllEmployees() throws FileNotFoundException, IOException, SQLException {
		List<Employee> list = new ArrayList<Employee>();
		PreparedStatement statement = JdbcUtils.getConnection().prepareStatement("SELECT * FROM employees e");
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
	}
	private Employee resultSetToEmployee(ResultSet rs) throws SQLException {
		Employee employee = new Employee();
		
		employee.setId(rs.getInt("employee_id"));
		employee.setLastName(rs.getString("last_name"));
		employee.setFirstName(rs.getString("first_name"));
		employee.setDepartment(Department.values()[rs.getInt("department_id")-1]);
		
	
		return employee;
	}
	public boolean insert(Employee employee) throws SQLException{
		if(employee==null) return false;
		PreparedStatement statement = JdbcUtils.getConnection().prepareStatement("INSERT INTO employeesdb.employees(employee_id, last_name, first_name, department_id)VALUES(?,?,?,?)");
				statement.setInt(1, employee.getId());
				statement.setString(2, employee.getFirstName());
				statement.setString(3, employee.getLastName());
			int count = 0;
			try {
				count = statement.executeUpdate();
			}catch(SQLException sqle) {
				log.error("Error executing insert for employee: " + employee);
			}finally {
				statement.close();
			}
			return count > 0;
	}
	public boolean delete(int employeeId) throws SQLException {
		if(employeeId==0) {
			return false;
		}
		PreparedStatement statement = JdbcUtils.getConnection().prepareStatement("DELETE FROM employeesdb.employees WHERE employee_id = ?");
		statement.setInt(1, employeeId);
		int count = 0;
		
		if(statement==null) return false;

		try {
			count = statement.executeUpdate();
		}catch (SQLException sqle) {
			log.error("Error executing delete for employee " + employeeId);
		}finally {
			statement.close();
		}
		return count>0;
	}
	
}
