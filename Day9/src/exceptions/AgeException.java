package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeException {

	public static void main(String[] args) {
		
		boolean x = true;
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age: ");

		while(x) {
			try {
				age = scan.nextInt();
				x = false;
				System.out.println("You are " + age + " years old.");
				}catch(InputMismatchException e){
				System.out.println("This input is no good: " + scan.next());
				System.out.println("Error: Please Enter Numbers Only");
				System.out.println("Enter age: ");
				age = scan.nextInt();
				x = false; 
				System.out.println("You are " + age + " years old.");
				
				//}catch(Exception e){
				//System.out.println("Error: Please Enter Numbers Only");
				}finally {
					System.out.println("Input in the 'finally' block ");
				}
				System.out.println("Reached after try-catch-finally!");
				scan.close();
			}
	}
}
