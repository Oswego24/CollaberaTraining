package continuetest;

public class Continue1 {
	
	//The continue statement is used in loop control structure
	//when you need to jump to the next iteration of the loop immediately

	public static void main(String[] args) {
		//outer loop
		for(int i=1; i<=3; i++) {
			//inner loop
			for(int j=1; j<=3; j++) {
				if(i==2&&j==2) {
					//using continue statement inside inner loop
					continue;
				}
				System.out.println(i + " " + j);
			}
		}

	}

}
