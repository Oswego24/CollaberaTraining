package regex;

import java.util.regex.*;

public class myRegex {

	public static void main(String[] args) {

		System.out.println("Regex By Character Classes and Quantifiers: ");
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949")); //true 
		System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949")); //true
		
		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490")); //false 11 char
		System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949")); //false (starts with 6. Not 7,8, or 9)
		System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949")); //true
		
		System.out.println("Regex By Meta Characters: ");
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949")); //true
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949")); //false (starts from 3. Not 7,8, or 9)
	}
}