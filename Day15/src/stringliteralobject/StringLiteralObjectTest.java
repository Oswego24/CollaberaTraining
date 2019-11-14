package stringliteralobject;

public class StringLiteralObjectTest {

	public static void main(String[] args) {
		String s1 = "Hello";    //String literal
		String s2 = "Hello";    //String literal
		String s3 = s1;         //same reference
		String s4 = new String("Hello");  //String object
		String s5 = new String("Hello");  //String object
		
		//System.out.println("s1 == s1 " + (s1==s1));   //true, same pointer
		System.out.println("s1 == s2 : " + (s1 == s2));    //true, s1 and s1 share storage in the same memory
		System.out.println("s1 == s3 : " + (s1 == s3));    //true, s3 references s1
		System.out.println("s1.equals(s3) : " + (s1.equals(s3))); //true, 
		System.out.println("s1 == s4 : " + (s1 == s4)); //false, pointing to two different locations in memory
		System.out.println("s1.equals(s4) : " + (s1.equals(4))); //false,
		System.out.println("s4 == s5 : " + (s4 == s5)); //false, 
		
	}

}
