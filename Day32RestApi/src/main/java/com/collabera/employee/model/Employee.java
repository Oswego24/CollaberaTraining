package com.collabera.employee.model;

import java.time.LocalDate;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private String department;
	private LocalDate hireDate;
	
	public Employee() {
		this(-1, "N/A", "N/A", "N/A", LocalDate.now());
	}

	public Employee(int id, String firstName, String lastName, String department, LocalDate hireDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.hireDate = hireDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
				+ department + ", hireDate=" + hireDate + "]";
	}
	
}
