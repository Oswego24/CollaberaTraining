
public class UsingMath {

	public static void main(String[] args) {
//		for(int i=0; i<=20; i++) {
//			double result = Math.pow(1.25, i);
//			System.out.println("1.25 to the power of " + i + " equals " + result);
//		}
//		int counter = 30;
//		for(char i=30; i<=127; i++) {
//			int counter = i;
//			System.out.println("Character at index " + counter + ": " + i);
//			counter++;
		char upperCase = 'A';
		char lowerCase = 'a';
		
		for(int i=1; i<=26; i++) {
			System.out.println(upperCase + "\t" + lowerCase);
			upperCase++;
			lowerCase++;
		}

	}

}
