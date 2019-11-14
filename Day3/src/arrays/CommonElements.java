package arrays;

import java.util.Arrays;

public class CommonElements {

	public static void main(String[] args) {
		
		int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
		int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};
		
		System.out.println("Array1 : " + Arrays.toString(array1));//Prints your array as a String
		System.out.println("Array2 : " + Arrays.toString(array2));
		
		for(int i=0; i < array1.length; i++) { //i starts at 0 and is less than the array length
			for(int j=0; j < array2.length; j++) {//j is the same with array 2
				if(array1[i] == array2[j]) {//if at any instance they are equal
					System.out.println("Common Element is : " + (array1[i]));//this statement
														//is printed along with the duplicates
					
				}
				
			}
		}

	}

}
