package random;

import java.lang.Math;

public class RandomNr {

	//driver code
	public static void main(String[] args) {

		//define the range as a variable
		int max = 10;
		int min = 0;
		int range = max - min + 1;
		
		//generate random numbers within 1 to 10
		for(int i=0; i<10; i++) {
			int random = (int)(Math.random() * range) + min;
			
			//Output is different everytime this code is executed
			System.out.println(random);
		}
	}

}


