package random;
import java.util.Random;
import java.util.Scanner;

public class randomHelper {

	public static void Helper() {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int random = 0;
		
		System.out.println("Guess a number between 1 and 5: ");
		num = scan.nextInt();
		random = ran.nextInt(4) + 1;
		System.out.println(random);
		System.out.println("==========");
		
		if(num == random) {
			System.out.println("You guessed it!");
		}else if(num > 5 || num <= 0){
			System.out.println("ERROR: Out of Bounds. Guess between 1 and 5");
		}else{
			System.out.println("Close one!");
		}
	}

}
