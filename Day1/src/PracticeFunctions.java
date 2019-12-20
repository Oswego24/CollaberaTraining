import java.util.Scanner;

public class PracticeFunctions {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
//		System.out.println("-----Our first function will calculate the area of a wall-----");
//		wall();
//		System.out.println("-----Our second function will calculate the area of a sail-----");
//		boat();
//		System.out.println("-----Our third function will calculate the number of centimeters in a given amount of inches-----");
//		inchesToCentimeters();
//		System.out.println("-----Our fourth function will calculate the tempurature in farenheit from celcius-----");
//		tempurature();
		System.out.println("-----Our fifth function will convert feet to meters-----");
		feetToMeters();
		
	}
	static void wall() {
		//A wall has deminsions: Length 23, Width 12
		//Write a program to calc the area
		System.out.println("Please Enter the Length: ");
		double length = scan.nextDouble();
		System.out.println("Please Enter the Width: ");
		double width = scan.nextDouble();
		
		double area= length * width;
		
		System.out.println("The area of the wall is: " + area + " sqr/ft");
	}
	static void boat() {
		//A sail on a sailboat (triangle) has a height of 14ft and a base of 6ft
		//Wrtie a program to calc the area of the sail
		System.out.println("Please Enter the Height of the Sail: ");
		double height = scan.nextDouble();
		System.out.println("Please Enter the Base of the Sail: ");
		double base = scan.nextDouble();
		
		double area = (base * height)/2;
		System.out.println("The area of the sail is: " + area  + " sqr/ft");
	}
	static void inchesToCentimeters() {
		System.out.println("Please Enter the Number of Inches: ");
		double inches = scan.nextDouble();
		double cent = inches * 2.54;
		System.out.println("There are " + cent + " centimeters in " + inches + " inches.");
	}
	static void tempurature() {
		System.out.println("Please enter the tempurature in celcius: ");
		double celcius = scan.nextDouble();
		double farenheit = (9.0 / 5.0) * celcius + 32;
		System.out.println(celcius + " degress celcius = " + farenheit + " degress farenheit");
	}
	static void feetToMeters() {
		System.out.println("Please enter the footage for conversion: ");
		double feet = scan.nextDouble();
		double meters = feet * 0.305;
		System.out.println(feet + " Feet is = " + meters + " Meters");
	}
}
