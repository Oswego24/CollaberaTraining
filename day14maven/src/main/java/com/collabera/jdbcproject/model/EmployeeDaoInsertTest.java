package com.collabera.jdbcproject.model;

import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Test;

public class EmployeeDaoInsertTest {
	@Test
	public void testInsert() {
		boolean inserted = false;
		EmployeeDao employeeDao = new EmployeeDao();
		try {
			inserted = employeeDao.insert(new Employee(46, "Jon6", "snow", Department.DEVELOPMENT));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		assertTrue(inserted);
	}
}
