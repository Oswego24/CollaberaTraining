package streams;

import java.util.*;

public class ParallelStream {

	public static void main(String[] args) {
		List<MyEmployee> empList = new ArrayList<MyEmployee>();
		for(int i=0; i<300; i++) {
			empList.add(new MyEmployee('A', 20000));
			empList.add(new MyEmployee('B', 3000));
			empList.add(new MyEmployee('C', 15002));
			empList.add(new MyEmployee('D', 7856));
			empList.add(new MyEmployee('E', 200));
			empList.add(new MyEmployee('F', 50000));
		}
		long t1 = System.currentTimeMillis();
		System.out.println("Sequential Stream count: " +empList.stream()
														.filter(e->e.getSalary()>15000).count());
		long t2 = System.currentTimeMillis();
		System.out.println("Sequential Stream Time taken: " +(t2-t1));
		
		t1 = System.currentTimeMillis();
		System.out.println("Parallel Stream count: " +empList.parallelStream()
													.filter(e->e.getSalary()>15000).count());
		
		t2 = System.currentTimeMillis();
		System.out.println("Parallel Stream Time taken: " +(t2-t1));
	}

}
 class MyEmployee {
	 private char name;
	 private int salary;
	public MyEmployee(char name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public char getName() {
		return name;
	}
	public void setName(char name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	 
 }