package multiarray;

public class MatrixCalc {

	public static void main(String[] args) {

		int arr[][]= {{1,3,5},{2,4,6},{3,4,5},{1,4,7}};
		
		maxInRows(arr);
		
		System.out.println("------------------------");
		
		columnSum(arr);
		
	}

	public static void columnSum(int[][] arr) {
		int i,j,sum = 0;
		//finding the column sum
		for(i=0; i<arr[0].length; ++i) {
			sum = 0;
			for(j=0; j<arr.length; ++j) {
				//Add the elements 
				sum = sum + arr[j][i];
			}
			System.out.println("Sum of the column: " + i + " = " + sum);
		}
					
	}

	public static void maxInRows(int[][] arr) {
		int a = 0;
		
		for(int i=0; i<arr.length; i++) {
			a = arr[i][0];
			
			for(int j=0; j<arr[0].length; j++) {
				if(a < arr[i][j]) {
					a = arr[i][j];
							
				}
			}
			System.out.println("Max element of row: " + i + " = " + a);
		}
	}
		
}


