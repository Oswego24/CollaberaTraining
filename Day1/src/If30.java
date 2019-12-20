import java.util.Scanner;

public class If30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your age?: ");
		int age = scan.nextInt();
		
		if(age >30) {
			System.out.println("I may be older, but I'm wiser.");
		}else {
			System.out.println("I'm still young!");
		}
		scan.close();

	}

}
