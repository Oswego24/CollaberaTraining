package arrays;
import java.util.Scanner;

public class myArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double[] rainfall = new double[12];
		String[] monthName = new String[12];
		monthName[0] = "January";
		monthName[1] = "February";
		monthName[2] = "March";
		monthName[3] = "April";
		monthName[4] = "May";
		monthName[5] = "June";
		monthName[6] = "July";
		monthName[7] = "August";
		monthName[8] = "September";
		monthName[9] = "October";
		monthName[10] = "November";
		monthName[11] = "December";
		
		double annualAverage, sum = 0.0;
		
		for(int i=0; i< rainfall.length; i++) {
			
			System.out.print("Rainfall for the month of " + monthName[i] +":");
			rainfall[i] = scanner.nextDouble();
			sum += rainfall[i];
		}
		annualAverage = sum/rainfall.length;
		System.out.println("Rainfall for the year: " + annualAverage);
		
		double[] quarterAverage = new double[4];
		
		for(int i=0; i<4; i++) {
			sum = 0;
			for(int j=0; j<3; j++) {
				sum += rainfall[3*i+j];
			}
			quarterAverage[i]=sum/3.0;
			System.out.println("Rainfall for the Quarter:" + quarterAverage[i]);
		}

	}
}
