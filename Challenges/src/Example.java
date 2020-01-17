import java.util.ArrayList;
import java.util.List;

public class Example {
	
	//Write code showing: 1. Composition
	//					  2. Inheritance
	//					  3. Polymorphism
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Oscar", "IT");
		Employee emp2 = new Employee(2, "Bill", "HR");
		Employee emp3 = new Employee(3, "Rex", "Sales");
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		System.out.println();
	}
}

class Employee {
	int id;
	String name;
	String dept;
	
	Employee(int id, String name, String dept){
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
}

class Department{
	String name;
	private List<Employee> emps;
	
	Department(String name, List<Employee> emps){
		this.name = name;
		this.emps = emps;
	}
	
	public List<Employee> getEmployee(){
		return emps;
		
	}
}