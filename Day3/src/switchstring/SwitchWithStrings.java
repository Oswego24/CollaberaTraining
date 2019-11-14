package switchstring;

public class SwitchWithStrings {
	//Java allows to use strings in switch expression since Java SE 7.
	//The case statement should be string literal.
	
	public static void main(String[] args) {
		//Declaring STring variable
		String levelString="Expert";
		int level=0;
		//Using String in Switch expression
		switch(levelString) {
			//Using String Literal in Switch case
			case "Beginner": level=1;
				break;
			case "Intermediate": level=2;
				break;
			case "Expert": level=3;
				break;
			case "Master": level=4;
				break;
			default: level=0;
				break;
		}
		System.out.println("Your level is: " +level);

	}

}
