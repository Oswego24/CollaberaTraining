package IfEsle;

public class TestScore {

	public static void main(String[] args) {
		
		int score=88;
		
		testScore(score);

	}
	
	public static void testScore(int score) {
		if(score>= 90) {
			System.out.print("Your grade is an A");
	   }else if(score >= 80) { 
			System.out.print("Your grade is a B");
	   }else if(score >= 70) { 
			System.out.print("Your grade is a C");
	   }else if(score >= 60) {
			System.out.print("Your grade is a D");
	   }else {
			System.out.print("Your grade is a F");
	   }
	}

}
