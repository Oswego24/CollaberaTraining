import java.util.Scanner;

public class Piglatin {

	public static void main(String[] args) {
		System.out.println("Enter a sentence: ");
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		
		String[] flip = sentence.split(" ");
		
		for(int i=0; i<flip.length; i++) {
			for(int j=flip[i].length()-1; j>=0; j--) {
				StringBuilder sb = new StringBuilder();
				sb.append(flip[i].charAt(j));
				System.out.print(sb);
			}
			System.out.print(" ");
		}
		scan.close();
	}

}
