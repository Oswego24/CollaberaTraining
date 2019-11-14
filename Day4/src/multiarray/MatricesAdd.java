package multiarray;

/*
 * The addition of two matrices:
 * 
 * |1 3 4|  +  | 1 3 4 | = | 2 6 8 |
 * |3 4 5|  +  | 3 4 5 | = | 6 8 10|
 */
public class MatricesAdd {

	public static void main(String[] args) {
		//creating two matrices
		int a[][]= {{1,3,4},{3,4,5}};
		int b[][]= {{1,3,4},{3,4,5}};
		
		addMatrices(a, b);
		

	}

	public static void addMatrices(int[][] a, int[][] b) {
		//Create a third matrix variable to store the sum of the two matrices
		int arr[][]= new int[a.length][a[0].length];
		
		//adding and printing the sum of the two matrices a and b 
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				arr[i][j] = a[i][j] + b[i][j];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
