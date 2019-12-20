package AssessmentReview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

    private static int counter = 0;
    private Object id;
    private String name;
    private int salary;
    private String department;

    public Employee(String name, int salary, String department) {
        this.id = counter++;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
    }
    
    public static void main(String[] args) {
    	question1();
    	question2();
    	question3();
    }
    static void question1() {
        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee("Josiah", 90000, "Engineer"));
        employees.add(new Employee("Matt", 100000, "Engineer"));
        employees.add(new Employee("Abe", 250000, "Engineer"));
        employees.add(new Employee("Terry", 250001, "Database Arch"));
        employees.add(new Employee("Roy", 2500000, "CEO"));
        employees.add(new Employee("Brian", 70000, "Dev"));
        employees.add(new Employee("Danny", Integer.MAX_VALUE, "Juggling"));
        employees.add(new Employee("Dan", 3000000, "Management"));
        employees.add(new Employee("Lee", 0, "Intern"));
        employees.add(new Employee("Terri", 350000, "Dev"));
        employees.add(new Employee("Stanley", 75000, "Dev"));
        employees.add(new Employee("Donny", 85000, "Mobile Eng"));
        employees.add(new Employee("Rebecca", 650000, "Finances"));
        
        //My noob way
//        List<Employee> twoLowest = new ArrayList<Employee>();
//        Employee lowest = employees.stream()
//        		.filter(employee -> employee.getSalary() == 0)
//        		.findAny()
//        		.orElse(null);
//        twoLowest.add(lowest);
//        Employee secondLowest = employees.stream()
//        		.filter(employee -> employee.getSalary() <= 70000)
//        		.findAny()
//        		.orElse(null);
//        twoLowest.add(secondLowest);
//        
//        System.out.println(twoLowest);
//        
//        //More proper way courtesy to Solon
        employees.stream()
        	.sorted(Comparator.comparingInt(Employee::getSalary))
        	.limit(2)
        	.collect(Collectors.toCollection(ArrayList::new))
        	.forEach(System.out::println);
    }
    static void question2() {
    	List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee("Josiah", 90000, "Engineer"));
        employees.add(new Employee("Matt", 100000, "Engineer"));
        employees.add(new Employee("Abe", 250000, "Engineer"));
        employees.add(new Employee("Terry", 250001, "Database Arch"));
        employees.add(new Employee("Roy", 2500000, "CEO"));
        employees.add(new Employee("Brian", 70000, "Dev"));
        employees.add(new Employee("Danny", Integer.MAX_VALUE, "Juggling"));
        employees.add(new Employee("Dan", 3000000, "Management"));
        employees.add(new Employee("Lee", 0, "Intern"));
        employees.add(new Employee("Terri", 350000, "Dev"));
        employees.add(new Employee("Stanley", 75000, "Dev"));
        employees.add(new Employee("Donny", 85000, "Mobile Eng"));
        employees.add(new Employee("Rebecca", 650000, "Finances"));
        
        //Normal stream courtesy of Kyle
        employees.stream()
        	.map(Employee::getDepartment)
        	.distinct()
        	.forEach(System.out::println);
        
        //My absolutely awful stream
       
//        List<Employee> departments = new ArrayList<Employee>();
//        Employee dep = employees.stream()
//        		.filter(emp -> emp.getDepartment() == "Engineer")
////        		.filter(emp -> emp.getDepartment() == "Dev")
////        		.filter(emp -> emp.getDepartment() == "Juggling")
////        		.filter(emp -> emp.getDepartment() == "Management")
////        		.filter(emp -> emp.getDepartment() == "Intern")
////        		.filter(emp -> emp.getDepartment() == "Mobile Eng")
////        		.filter(emp -> emp.getDepartment() == "Finances")
//        		.findFirst()
//        		.orElse(null);
//        departments.add(dep);
//        Employee dep2 = employees.stream()
//        		.filter(emp -> emp.getDepartment() == "Database Arch")
//        		.findFirst()
//        		.orElse(null);
//        departments.add(dep2);
//        Employee dep3 = employees.stream()
//        		.filter(emp -> emp.getDepartment() == "CEO")
//        		.findFirst()
//        		.orElse(null);
//        departments.add(dep3);
//        Employee dep4 = employees.stream()
//        		.filter(emp -> emp.getDepartment() == "Dev")
//        		.findFirst()
//        		.orElse(null);
//        departments.add(dep4);
//        Employee dep5 = employees.stream()
//        		.filter(emp -> emp.getDepartment() == "Juggling")
//        		.findFirst()
//        		.orElse(null);
//        departments.add(dep5);
//        Employee dep6 = employees.stream()
//        		.filter(emp -> emp.getDepartment() == "Management")
//        		.findFirst()
//        		.orElse(null);
//        departments.add(dep6);
//        Employee dep7 = employees.stream()
//        		.filter(emp -> emp.getDepartment() == "Intern")
//        		.findFirst()
//        		.orElse(null);
//        departments.add(dep7);
//        Employee dep8 = employees.stream()
//        		.filter(emp -> emp.getDepartment() == "Mobile Eng")
//        		.findFirst()
//        		.orElse(null);
//        departments.add(dep8);
//        Employee dep9 = employees.stream()
//        		.filter(emp -> emp.getDepartment() == "Finances")
//        		.findFirst()
//        		.orElse(null);
//        departments.add(dep9);
//        
//        System.out.print(departments + "\n");
    }
    static void question3() {

    	int[] list = new int[] {1,2,4,0,0,7,9};
    	
    	
    	//Jeremy's solution
    	
//    	StringBuffer sb = new StringBuffer();
//    	
//		for(int num: list) {
//    		if(num == 0 || num == 7) {
//    			sb.append(Integer.toString(num));
//    		}
//    		if(sb.toString().equals("007") || sb.indexOf("007") != 1) {
//    			return true;
//    		}
//    	}
    	
    	//Ashur's Solution 
    	
    	int index = 0;
    	for(; index<list.length; index++) {
    		if(list[index]==0) {
    			break;
    		}
    	}
    	for(; index<list.length; index++) {
    		if(list[index]==0) {
    			break;
    		}
    	}
    	for(; index<list.length; index++) {
    		if(list[index]==7) {
    			break;
    		}
    	}
    	System.out.println(index);
    	
    }
}

