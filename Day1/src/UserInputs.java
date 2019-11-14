import java.util.Scanner;

public class UserInputs {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter Your First Name: ");
		String name = scanner.next();
		System.out.println("Nice to meet you " + name);
		System.out.println("Please Enter Your Age: ");
		//int age = scanner.nextInt();
		long age = scanner.nextLong();
		System.out.println(age - 5);
	
		
	}


}
