package person;

import java.util.Scanner;

public class PersonArray {

	public static void main(String[] args) {
		
		Person[] persons;
		persons = new Person[10];
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int age;
		String gender;
		
		for(int i=0; i<persons.length; i++) {
			System.out.println("Please Enter Name: "); 
			name = scanner.next();
			System.out.println("Please Enter Age: ");
			age = scanner.nextInt();
			System.out.println("Please Enter Gender: ");
			gender = scanner.next();

			persons[i].setName(name);
			persons[i].setAge(age);
			persons[i].setGender(gender);
		}
		scanner.close();
	}
}