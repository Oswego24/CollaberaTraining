package coreJava;

import java.util.Scanner;

public class trueFalseQuiz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean state = false;
		while(state==false) {
			System.out.println("The Capital of the United States is Washington D.C. (T/F)");
			String answer = scan.nextLine();
			if(answer.equals("t") || answer.equals("T")) {
				System.out.println("Correct!");
				state = true;
			}else if(answer.equals("f") || answer.equals("F")) {
				System.out.println("Incorrect!");
				state = true;
			}else {
				System.out.println("What in the world are you typing?");
			}
		}
	}
}
