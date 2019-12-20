
public class ForLoops {

	public static void main(String[] args) {
		int counter = 0;
		
		for(int i=0; i<=10; i++) {
			System.out.println(i);
			counter++;
			if(counter<=10) {
				System.out.println("You're incrementing through the loop");
			}else {
				System.out.println("You've come to the end of the loop!");
			}
		}
		System.out.println("\n\nWe're going to use StringBuilder and some for loops to reverse the words in a sentence ");
		String sent = "Java is fun";
		String[] words = sent.split(" ");
		System.out.println("Original Sentence: " + sent);
		System.out.print("Appended Sentence: ");
		for(int i=0; i<words.length; i++) {
			for(int j=words[i].length()-1; j>=0; j--) {
				StringBuilder sb = new StringBuilder();
				sb.append(words[i].charAt(j));
				System.out.print(sb);
			}
			System.out.print(" ");
		}
		int blastoff = 10;
		for(int countdown = 10; countdown > 0; countdown--) {
			System.out.println(countdown);
			System.out.println("--");
			blastoff--;
			if(blastoff == 0) {
				System.out.println("Blastoff!!!");
			}
		}
		//count by 2's to 16
		for(int i=0; i<=16; i=i+2) {
			System.out.println("The counter is at: " + i);
		}
	}

}
