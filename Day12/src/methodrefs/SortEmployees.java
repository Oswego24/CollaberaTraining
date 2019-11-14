package methodrefs;

import java.util.Arrays;

public class SortEmployees {

	public static void main(String[] args) {

		Employee[] employees = {
				new Employee("Bill"),
				new Employee("Karen"),
				new Employee("Naveen"),
				new Employee("Richard"),
				new Employee("Bob")};
		System.out.println("Before sorting Names: " + Arrays.toString(employees));
		Arrays.sort(employees, Employee::nameCompare);
		System.out.println("After sorting Names: " + Arrays.toString(employees));
	}

}

class Employee{
	String name;
	Employee(String name){
		this.name = name;
	}
	
	public static int nameCompare(Employee a1, Employee a2) {
		//Descending order
		//return a2.name.compareTo(a1.name);	
		//return -(a1.name.compareTo(a2.name));
		//Ascending order
		//return a1.name.compareTo(a2.name);
		//Sort by Length of String
		//return a1.name.length() - a2.name.length();
		//Sort by length Descending order
		return a2.name.length() - a1.name.length();
	
	}
	public String toString() {
		return name;
	}
}
