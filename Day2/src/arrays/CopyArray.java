package arrays;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] new_array = new int[10];
		
			//Could use i < my_array.length here
				//    |
				//   \/
		for(int i=0; i<10; i++) {
			new_array[i] = my_array[i];
		}
		System.out.println("Our original array: " + Arrays.toString(my_array));
		System.out.println("Our new array: " + Arrays.toString(new_array));
	}
	
}
