package random;
import java.util.Scanner;

public class GuessLetters {

	public static void main(String[] args) {
		
		final String pizza = "PIZZA";
		
		String currentWord = "";
		String updatedWord = "";
		String letterGuess;
		int numGuess = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Guess the Word!\n");

		for(int i=0; i<pizza.length(); i++) {
			currentWord += "-"; //word as dashes	
		}
		System.out.println(currentWord + "\n");
		
		do {  //user input for guesses
			System.out.println("Enter a letter : ");
			letterGuess = scanner.nextLine();
			letterGuess = letterGuess.toUpperCase();
			
			numGuess += 1; //increments our number of guesses
			
			/*player correctly guessed a letter. extract string in currentWord up to the letter
			 * guessed and then append guessed letter to that string. Next, extract the rest of
			 * currentWord and append after the guessed letter
			 */
			
			if(pizza.indexOf(letterGuess) >= 0) {
				updatedWord = currentWord.substring(0, pizza.indexOf(letterGuess));
				updatedWord += letterGuess;
				updatedWord += currentWord.substring(pizza.indexOf(letterGuess)+1, currentWord.length());
				currentWord = updatedWord;
			}
			System.out.println(currentWord + "\n");
		}while(!currentWord.equals(pizza));
		
		if(currentWord.equals(pizza)) {
			System.out.println("You won!");
		}else {
			System.out.println("Close but no cigar! Or pizza i guess...");
		}
		System.out.println("The secret word is " + pizza);
		System.out.println("You guessed " + numGuess + " times.");
	}
	
}

