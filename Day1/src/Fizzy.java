import java.util.Scanner;

public class Fizzy {

	public static void main(String[] args) {
		question1();
		question2("Super special stuff for you guys");
		question3();
		question4();
		question5();
	}
	public static void question1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String s = scan.next();
		
		StringBuilder sb = new StringBuilder();
		String s1 = s.replaceAll("[aeiouAEIOU]", "-");
		sb.append(s);
		System.out.println(sb);
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		
		for(char c: s.toCharArray()) {
			for(char d: vowels) {
				if(d == c) {
					sb.append(c);
					break;
				}
			}
		}
		System.out.println(s1);
	}
	public static void question2(String sent) {
		String[] words = sent.split("\\s+");
		
		for(String word: words) {
			if(word.charAt(0)=='s'||word.charAt(0)=='S') {
				System.out.println(word);
			}
		}
	}
	public static void question3() {
		int num = 100;
		
		for(int i=0; i<=100; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
	}
	public static void question4() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter a sentence: ");
		String input = scan.nextLine();
		int count = 0;
		
		String[] words = input.split(" ");
			for(String word: words) {
				if(word.length()%2==0) {
					count++;
				}
			}
			System.out.println("Even number of words: " + count);
	}
	
	//Purpose of FizzBuzz interview question:
	//1. Performance
	//2. Code Reuse
	//3. How you think 
	public static void question5() {
		for(int i=1; i<=100; i++) {
			if(i % 15 == 0) {
				System.out.print("Fizzbuzz " + " ");
			}else if(i % 5 == 0) {
				System.out.print("Buzz " + " ");
			}else if(i % 3 == 0) {
				System.out.print("Fizz " + " ");
			}else {
				System.out.print(i + " ");
			}
		}
	}
}
