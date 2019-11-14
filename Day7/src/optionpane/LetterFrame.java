package optionpane;

import javax.swing.*;

public class LetterFrame {
	
	JFrame f = new JFrame();
	
	void Message(String msg) {
		JOptionPane.showMessageDialog(f, msg);
	}

	public static void main(String[] args) {
		LetterFrame object = new LetterFrame();
		String m = JOptionPane.showInputDialog("Enter a word: ", "We'll count the vowels");
		System.out.println(m);
		
		char letter;
	
		
		int numberOfCharacters = m.length();
		int vowelCount = 0;
		
		for(int i=0; i<numberOfCharacters; i++) {
			letter = m.charAt(i);
			
			if(letter =='a' || letter =='A'|| letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U') {
				vowelCount++;
			}
			
		}
		object.Message(m + ", your name has " + vowelCount + " vowels");
		
	}

}
