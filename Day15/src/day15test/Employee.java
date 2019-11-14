package day15test;

import java.util.Scanner;
import java.util.TreeMap;

public class Employee{
	private int id;
	protected String lastName;
	protected String firstName;
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
			case 1: 
				//add();
				System.out.println("Enter ID: ");
				int id = scan.nextInt();
				if(tree.containsKey(id)) {
					System.out.println("Employee ID already in the system");
				}else {
					System.out.println("Enter First name: ");
					String firstName = scan.next();
					names.setFirstName(firstName);
					System.out.println("Enter Last Name: ");
					String lastName = scan.next();
					names.setLastName(lastName);
					String fullName = firstName + " " + lastName;
//					names.firstName = firstName;
//					names.lastName = lastName;
				
					System.out.println("Enter Department:\n1. ACCOUNTING\n2. HR\n3. DEVELOPMENT\n4. SALES");
					int dep = scan.nextInt();
					switch(dep) {
						case 1: 
							depo.setDepartment(Department.ACCOUNTING);
							break;
						case 2: 
							depo.setDepartment(Department.HR);
							break;
						case 3: 
							depo.setDepartment(Department.DEVELOPMENT);
							break;
						case 4: 
							depo.setDepartment(Department.SALES);
							break;
					}
						if(tree.containsValue(fullName)) {
							System.out.println("Employee ID already in the system");
						}else {
							System.out.println("Employee added. ID: " + id + " First Name: " + names.getFirstName() + " Last Name: " + names.getLastName() + " Department: " + depo.getDepartment());
							tree.put(id, fullName);
						}
			
					}
			break;
			case 2: 
				//remove();
				System.out.println("Enter ID: ");
				int idRemove = scan.nextInt();
				if(tree.containsKey(idRemove)) {
					System.out.println("Employee Found");
					System.out.println("Employee Removed: " + tree.get(idRemove));
					tree.remove(idRemove);
				}else {
					System.out.println("Employee ID not found in the system");
				}
				break;
			case 3: 
				//modify();
				System.out.println("Enter an ID to modify: ");
				int modID = scan.nextInt();
				if(tree.containsKey(modID)) {
					System.out.println(modID + " Found");
					tree.get(modID);
					System.out.println("Enter Department:\n1. ACCOUNTING\n2. HR\n3. DEVELOPMENT\n4. SALES");
					int dep = scan.nextInt();
//					Employee depo = new Employee();
					switch(dep) {
						case 1: 
							depo.setDepartment(Department.ACCOUNTING);
							break;
						case 2: 
							depo.setDepartment(Department.HR);
							break;
						case 3: 
							depo.setDepartment(Department.DEVELOPMENT);
							break;
						case 4: 
							depo.setDepartment(Department.SALES);
							break;
					}
					System.out.println("Department changed for " + tree.get(modID) + ": " + depo.getDepartment() + " Last Name: " + tree.getOrDefault(modID, names.lastName) + " First Name: " + tree.getOrDefault(modID, names.firstName));
					
				}else {
					System.out.println("ID Not Found");
				}
				break;
			case 4: 
				//print();
				System.out.println(tree.keySet() + " " + tree.values() + " " + depo.getDepartment());
				break;
			case 5: 
				//exit();
				x = true;
				break;
			}		
		}while(x!=true);
	}

	public Department getDepartment() {
		//FIGURE OUT HOW TO USE THIS WITH THE ENUM (DEPARTMENT)
//		System.out.println("Enter Department");
//		Department items[] = Department.values();
//		for(int i=0; i<items.length; i++) {
//			System.out.println((i+1) + ". " + items[i]);
//		}
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}


