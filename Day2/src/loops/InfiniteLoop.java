package loops;
import java.util.Scanner;

public class InfiniteLoop {

	public static void main(String[] args) {
		
		String name;
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("Your name: ");
			name= scanner.next();
			
			if(name.length() > 1)
				break;
			
			System.out.println("Invalid Entry" + "You must enter at least two characters");
			}

	}

}
