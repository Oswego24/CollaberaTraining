package streams;

import java.util.*;
import java.util.stream.*;

public class StreamsMinMax {

	public static void main(String[] args) {
		// Get min or max number
		Integer maxNumber = Stream.of(1,2,3,4,5,6,7,8,9)
							.max(Comparator.comparing(Integer::valueOf)) // returns Optional
							.get(); // using get() because if Optional is not empty, we want to get value
		
		Integer minNumber = Stream.of(1,2,3,4,5,6,7,8,9)
				.min(Comparator.comparing(Integer::valueOf))
				.get();
		
		System.out.println("maxNumber = " + maxNumber);
		System.out.println("minNumber = " + minNumber);
		
		// Find min or max object by object property
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(1, "Mark", 36));
		employees.add(new Employee(2, "Alex", 46));
		employees.add(new Employee(3, "Brian", 52));
		employees.add(new Employee(4, "Duane", 26));
		
		Comparator<Employee> comparator = Comparator.comparing(Employee::getAge);
		
		// Get min or max Object
		Employee minObject = employees.stream().min(comparator).get();
		Employee maxObject = employees.stream().max(comparator).get();
		
		System.out.println("minObject = " + minObject);
		System.out.println("maxObject = " + maxObject);
		
		// anyMatch()
		boolean anyMatch = employees.stream().anyMatch(e ->(e.getAge()>30));
		System.out.println("Any employee over 30? " + anyMatch);
		
		// count()
		Long numOfEmployees = employees.stream().filter(e ->(e.getAge()>30)).count();
		System.out.println("How many employees over 30? " + numOfEmployees);
	}

}

class Employee{
	private int id;
	private String name;
	private int age;
	
	// Generate constructor, getters&setters, and toString 
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}