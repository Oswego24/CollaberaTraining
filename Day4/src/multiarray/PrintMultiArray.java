package multiarray;

import java.util.Arrays;

/*
 * - data is stored in row and column based index (matrix form).
 * 
 * Declaration: dataType[][] arrayRefVar;
 * 
 * Instantiation: int[][] arr= new int[3][3]; //3 row and 3 column
 * 
 * Initialization: arr[0][0]=1; arr[0][1]=2;....
 * 
 */

public class PrintMultiArray {

	public static void main(String[] args) {

		//declaring and initializing 2D array
		int arr[][]= {{1,3,5},{2,4,6},{3,4,5},{1,4,7}}; //4 arrays with 3 elements 
		
	/*
	 * l 3 5
	 * 2 4 6
	 * 3 4 5
	 */
	//System.out.println(Arrays.toString(arr[0]));
	//System.out.println(Arrays.toString(arr[1]));
	//System.out.println(Arrays.toString(arr[2]));
	printMultiArray(arr);
}

	public static void printMultiArray(int[][] arr) {
		//printing 2D array
		for(int i=0; i<arr.length; i++) {  //You could make multiple for loops for each array 0 1 and 2
			for(int j=0; j<arr[i].length; j++) { //Or you could use i and j to to hold those values
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
