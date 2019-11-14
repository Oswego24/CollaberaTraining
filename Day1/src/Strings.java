
public class Strings {

	public static void main(String[] args) {
		
		String text = "Hello world Java";

		//extract substring "ll"
		//extract substring "world"
		//extract substring Java
		//generate error
		
		System.out.println(text.substring(2, 4));
		System.out.println(text.substring(6, 11));
		System.out.println(text.substring(12, 16));
		//System.out.println(text.substring(4, 1));
		
		//extract substring "llo world Java"
		System.out.println(text.substring(2));
		//extract the index of character a
		System.out.println(text.indexOf('a'));
		//extract the index of 'java' NOTE: you'll get '-1' if capitalization is wrong
		System.out.println(text.indexOf("Java"));
		//extract the length of the string
		System.out.println(text.length());
		//extract the index of the last character in the string
		System.out.println(text.charAt(text.length()-1));
		//Replace all l's in the string with r's
		System.out.println(text.replace('l', 'r'));
		//extract the has code for the string
		System.out.println("Hashcode: " + text.hashCode());
		//add two strings together and print the results
		String s1 = "pro";
		String s2 = "gram";
		System.out.println(s1 + s2);
		//Create a string buffer to be easier on memory
		StringBuffer buff = new StringBuffer();
		buff.append("This");
		buff.append(" ");
		buff.append("is");
		System.out.println(buff.toString());
		//print the string as is
		System.out.println(text);
		
		
		//Reverse a string
		//for loop from end to beginning
		//get char
		//concatenate to result
		String reverse = "";
		StringBuffer sb = new StringBuffer();
		for(int i = text.length() -1; i >= 0; i--){
			
			reverse = reverse + text.charAt(i);
			sb.append(text.charAt(i)); 
		}
		System.out.println(sb.toString());
		sb = new StringBuffer(text);
		System.out.println(sb.reverse());
	}

}
