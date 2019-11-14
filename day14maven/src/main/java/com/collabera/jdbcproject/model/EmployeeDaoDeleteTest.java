package com.collabera.jdbcproject.model;

import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.SQLException;

public class EmployeeDaoDeleteTest {
	
	@Test
	public void testDelete() {
		boolean deleted = false;
		EmployeeDao employeeDao = new EmployeeDao();
		try {
			deleted = employeeDao.delete(46);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		assertTrue(deleted);
	}
}
