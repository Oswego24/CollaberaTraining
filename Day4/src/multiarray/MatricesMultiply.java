package multiarray;

public class MatricesMultiply {

	public static void main(String[] args) {
		//two matrices
		int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int b[][]= {{1,1,1},{2,2,2},{3,3,3}};
		
		multiplyMatrices(a, b);

	}

	//creating another matrix to store the multiplication of two matrices
	public static void multiplyMatrices(int[][] a, int[][] b) {  //three rows and columns
		
		int c[][]= new int[a.length][a[0].length];
	
		//multiplying and printing multiplication of 2 matrices
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				c[i][j] = 0;
				for(int k=0; k<3; k++) {
					c[i][j]+=a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + " "); //printing matrix element
			}
			System.out.println();
		}
	}
}
