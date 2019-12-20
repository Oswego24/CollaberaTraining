package ems;

import java.util.Scanner;

public class Questions {

	public static void main(String[] args) {
		question1();
		question2();
	}
	static void question1() {
		int sum = 0;
		for(int i=0; i<=1000; i++) {
			if(i%3==0 || i%5==0) {
				
				sum += i;
				//System.out.println(i);	
			}
		}
		System.out.println(sum);
	}
	static void question2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word or sentence: ");
		String input = scan.nextLine();
		StringBuilder sb = new StringBuilder(input);
		String reverse = sb.reverse().toString();
		
		if(input.equals(reverse)) {
			System.out.println("This is a palindrome.");
			System.out.println(reverse);
			
		}else {
			System.out.println("This is not a palindrome. ");
			System.out.println(reverse);
		}
		
		scan.close();
	}

}
