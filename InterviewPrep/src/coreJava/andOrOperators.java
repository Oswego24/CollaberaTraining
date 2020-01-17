package coreJava;

import java.util.Scanner;

public class andOrOperators {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Your Age: ");
		int age = scan.nextInt();
		
		if(age>70 && age<100 || age<5) {
			System.out.println("Are you a baby or an elder?");
		}else if(age>=5 && age<13) {
			System.out.println("You're a young human!");
		}else if(age>=13 && age<=70) {
			System.out.println("Eh, you're somewhere in the middle");
		}else {
			System.out.println("You're either old or immortal!!");
		}
		scan.close();

	}

}
