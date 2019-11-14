package exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Student {
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) throws AgeInputException{
		if(age<=0) 
			throw new AgeInputException("Age should be greater than zero. ");
		this.age = age;
	}
	
	//public void setAge1(int age) throws InputMismatchException{
		//if(age != age) {
		//	throw new InputMismatchException("Age should only be an integer. ");
	//	}
	//}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [age = " + age + ", name = " + name + "]";
	}

	public static void main(String[] args) throws AgeInputException, InputMismatchException {
		
		Scanner scan = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter the Student's name: ");
		String name = scan.nextLine();
		student.setName(name);
		
		System.out.println("Enter the Student's age: ");
		int age = scan.nextInt();
		try {
			student.setAge(age); //Handling age exception4
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("Input Mismatch Occured!");
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("Please try again");
			System.out.println("Enter the Student's age: ");
			age = scan.nextInt();
			student.setAge(age); //Propagate the exception
		}
		
		//student.setAge(age);
		System.out.println(student);
		scan.close();
	}
}