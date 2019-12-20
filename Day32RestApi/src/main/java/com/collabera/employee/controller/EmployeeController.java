package com.collabera.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.employee.ems.EMS;
import com.collabera.employee.model.Employee;

@RestController
public class EmployeeController {

	@Autowired
	EMS service;
	
	@GetMapping("/api/employees")
	public List<Employee> getEmployees(){
		return service.getAllEmployee();	
	}

	@GetMapping("/api/employees/{employeeid}")
	public Employee getEmployee(@PathVariable String employeeid) {
		return service.getEmployee(Integer.parseInt(employeeid));
	}
}