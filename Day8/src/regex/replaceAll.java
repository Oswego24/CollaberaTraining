package regex;

import javax.swing.*;

public class replaceAll {
	public static void main(String[] args) {
		char letter;
		String inSentence = JOptionPane.showInputDialog(null, "Enter a Sentence: ");
		
		//We're going to use replaceAll to cut down on our code
		
//		StringBuffer name = new StringBuffer(inSentence);
//		int numberCharacters = name.length();
//	
//		for(int i=0; i < numberCharacters; i++) {
//			letter = name.charAt(i);
//			if(letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' ||
//					letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U') {
//				name.setCharAt(i, 'X');
//			}
//		}
		//String rep = inSentence.replaceAll("[aeiouAEIOU]", "*");
		String rep2 = inSentence.replaceFirst("[Welcome]", "No you w");
		JOptionPane.showMessageDialog(null, rep2);
	}
}
