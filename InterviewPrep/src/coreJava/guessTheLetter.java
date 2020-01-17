package coreJava;

import java.io.IOException;

public class guessTheLetter {

	public static void main(String[] args) throws IOException {
		//Scanner scan = new Scanner(System.in);
		boolean state = false;
		while(state==false) {
			System.out.println("What letter am I thinking of? ");
			char answer = (char) System.in.read();
			if(answer=='W' || answer=='w') {
				System.out.println("You guessed it!");
				state = true;
			}else {
				System.out.println("Nope! Try again");
				char old = (char) System.in.read();
				char old2 = (char) System.in.read();
			}
		}
	}
}
