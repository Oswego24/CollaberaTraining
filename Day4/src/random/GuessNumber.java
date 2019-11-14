package random;

import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//define the range as a variable
		int max = 10;
		int min = 0;
		int range = max - min + 1;
		int num = (int)(Math.random() * range) + min;
		boolean foundIt = false;
		int numberTrys = 0;
		//generate random numbers within 1 to 10
		while(!foundIt) {
			System.out.println("Please guess the number");			
			int guess = scanner.nextInt();
			numberTrys++;
			if(num == guess) {
				foundIt = true;
				System.out.println("Wow! You guessed it!");
				System.out.println("Your number of tries is " + numberTrys);
				//scanner.close();
				return;
			}else {
				System.out.println("Close, but no cigar!");
				if(num > guess) {
					System.out.println("You guessed too low");
				}else{
					System.out.println("You guessed too high");
				}
			}
		}
	}	
}









