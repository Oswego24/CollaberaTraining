package com.collabera.employee.ems;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.collabera.employee.model.Employee;

@Service
public class EMS {

	//mock database
	private static List<Employee> emp = new ArrayList<Employee>();
	private static int idCounter = 1;
	
	static {
		emp.add(new Employee(idCounter++, "Bobby", "Hill", "Cashier", LocalDate.of(1990, 8 , 4)));
		emp.add(new Employee(idCounter++, "Jack", "Ryan", "Cool Agent", LocalDate.of(1982, 11 , 21)));
		emp.add(new Employee(idCounter++, "Jack", "Reacher", "Renegade", LocalDate.of(1974, 9 , 1)));
		emp.add(new Employee(idCounter++, "Hank", "Hill", "Salesman", LocalDate.of(1968, 3 , 4)));
		emp.add(new Employee(idCounter++, "Hideo", "Kojima", "Director", LocalDate.of(1963, 8 , 24)));
	}
	
	public Employee addEmployee(String firstName, String lastName, String department, LocalDate hireDate) {
		Employee newEmployee = new Employee(idCounter++, firstName, lastName, department, hireDate);
		emp.add(newEmployee);
		return newEmployee;
	}
	public List<Employee> getAllEmployee(){
		return emp;
	}
	public Employee getEmployee(int id) {
		Employee employee = new Employee();
		
		for(int e=0; e<emp.size(); e++) {
			if(emp.get(e).getId() == e) {
				employee = emp.get(e);
				break;
			}
		}
		return employee;
	}
	public List<Employee> getEmployeesInDepartment(String department){
		List<Employee> empDepartment = new ArrayList<Employee>();
		
		for(int e=0; e<emp.size(); e++) {
			if(emp.get(e).getDepartment().toLowerCase().equals(department.toLowerCase())) {
				empDepartment.add(emp.get(e));
			}
		}
		return empDepartment;
	}
	public Employee updateEmployee(Employee employee) {
		
		Employee empToUpdate = getEmployee(employee.getId());
		if(empToUpdate.getId() != -1) {
			empToUpdate.setFirstName(employee.getFirstName());
			empToUpdate.setLastName(employee.getLastName());
			empToUpdate.setDepartment(employee.getDepartment());
			empToUpdate.setHireDate(employee.getHireDate());
		}
		return empToUpdate;
		
	}
	public Employee deleteEmp(int id) {
		Employee empToRemove = new Employee();
		
		for(int e=0; e<emp.size(); e++) {
			if(emp.get(e).getId() == id) {
				empToRemove = emp.get(e);
				emp.remove(e);
				break;
			}
		}
		return empToRemove;
	}
	public void deleteAllStudents() {
		emp.clear();
	}
}
