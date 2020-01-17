package morningChallenges;

import java.util.Arrays;

public class matchArray {

	public static void main(String[] args) {
		int[] arrayOne = {1,2,3};
		int[] arrayTwo = {3,2,1};
		
		Arrays.sort(arrayTwo);
		Arrays.sort(arrayOne);
		
		for(int i=0; i<arrayOne.length; i++) {
			if(arrayTwo[i] == arrayOne[i]) {
				System.out.println("The arrays match!");
			}else {
				System.out.println("No matches here!");
			}
		}

	}

}
