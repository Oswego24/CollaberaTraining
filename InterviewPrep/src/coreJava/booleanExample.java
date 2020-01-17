package coreJava;

import java.util.Scanner;

public class booleanExample {

	public static void main(String[] args) {
		boolean bool;
		boolean state = false;
		Scanner scan = new Scanner(System.in);
		
		while(state==false) {
			System.out.println("Is the value of the variable true or false? (1/0)");
			int input = scan.nextInt();
			if(input==1) {
				for(int i=0; i<3; i++) {
					bool = true;
					state = true;
					System.out.println("The value of the variable is " + bool);
				}
			}else if(input==0) {
				for(int i=0; i<3; i++) {
					bool = false;
					state = true;
					System.out.println("The value of the variable is " + bool);
				}
			}else {
				System.out.println("Invalid entry. Please try again.");
				state = false;
			}
		}
	}
}
