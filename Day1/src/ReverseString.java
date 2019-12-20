
public class ReverseString {

	public static void main(String[] args) {
		//Reverse a string with char array
		String input = "racsO";
		char[] reverse = input.toCharArray();
		char[] result = new char[reverse.length];
		
		for(int i=0; i<reverse.length; i++) {
			result[i] = reverse[reverse.length-i-1];
		}
		System.out.println("String Length: " + reverse.length);
		System.out.println("Reversed String: " + new String(result));
	
		//Reverse a string with StringBuilder
		StringBuilder input1 = new StringBuilder();
		input1.append(input);
		input1 = input1.reverse();
		System.out.println(input1);
	}

}
