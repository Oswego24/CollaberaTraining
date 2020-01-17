package morningChallenges;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Jan9MorningChallenge{
	//Find the largest prime factor of a given number
	
	public static void main(String[] args) {
		try(Scanner input = new Scanner(System.in)){
			System.out.println("Please enter a number: ");
			int num = input.nextInt();
			int result = primeFactor(num);
			System.out.println("The largest prime factor of " + num + " is " + result);
			assert num>=10 && num<=75 : "Number out of desired range";
			input.close();
		}catch(InputMismatchException e) {
			System.out.println("Number is WAY too big");
			e.getMessage();
		}
	}
	
	public static int primeFactor(int num) {
		if(num<=1) {
			return 0;
		}else {
			int divisor = 2;
			while(divisor < num) {
				if(num % divisor != 0) {
					divisor++;
				}else {
					num = num / divisor;
					divisor = 2;
				}
			}
			return num;
		}
	}
	class yourOwnException extends Exception{
		private static final long serialVersionUID = 1L;
		public yourOwnException(String s) {
			super(s);
		}
	}
}
