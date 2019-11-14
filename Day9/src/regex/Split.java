package regex;

public class Split {
	
	//In String class
	//public String[] split(String regexStr)

	public static void main(String[] args) {

		String source = "There are thirty_three big-apple";
		String[] tokens = source.split("\\s+|-|_"); //whitespace(s) or - or _
		for(String token : tokens) {
			System.out.println(token);
		}
		
		String date = "12/13/2010";
		//extract day, month, and year from the String
		String[] d = date.split("\\/"); // splits at any / in the string
		for(String t : d) {
			System.out.println(t);
		}

	}

}
