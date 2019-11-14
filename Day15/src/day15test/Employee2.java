package day15test;

import java.util.Scanner;
import java.util.TreeMap;

public class Employee2 extends EMS {
	private int id;
	private String lastName;
	private String firstName;
	private Department department;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TreeMap<Integer, String> tree = new TreeMap<>();
		boolean x = false;
		
		do {
			System.out.println("1. ADD\n2. REMOVE\n3. MODIFY\n4. PRINT\n5. EXIT");
			int i = scan.nextInt();
			Employee depo = new Employee();
			Employee names = new Employee();
			switch(i) {
			case 1: add();
			
			}
		}while(x!=true);
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
