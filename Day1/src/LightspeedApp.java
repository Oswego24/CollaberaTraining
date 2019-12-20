import java.util.Scanner;

public class LightspeedApp {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("How many minutes do you want to travel at light speed? ");
		int minutes = scan.nextInt();
		System.out.println("In " + minutes + " minutes you can travel " + lightspeed(minutes) + " miles at lightspeed. ");
		restart();

	}
	static long lightspeed(int minutes) {
		long distance;
		distance = 186282L * minutes * 60;
		return distance;
	}
	static void restart() {
		System.out.println("Would you like to recalculate? Yes = 1. No = 0.");
		int restart = scan.nextInt();
		if(restart == 1) {
			System.out.println("\t\t---RESTARTING PROGRAM---\n\n");
			main(null);
		}else if(restart == 0) {
			System.out.println("Thanks for using our program. Goodbye!");
			scan.close();
		}else {
			System.out.println("Invalid Entry. Program closing...");
			scan.close();
		}

	}

}
