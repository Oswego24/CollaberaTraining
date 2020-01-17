package coreJava;

import java.util.Scanner;

public class basicIntegerDeclaration {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What are you trying to find the volume of?");
		String device = scan.nextLine();
		System.out.println("Please enter the length: ");
		int length = scan.nextInt();
		System.out.println("Please enter the width: ");
		int width = scan.nextInt();
		System.out.println("Please enter the height: ");
		int height = scan.nextInt();

		
		int volume = length * width * height;
		
		System.out.println("The volume of the " + device + " is " + volume);
		scan.close();
		
		

	}

}
