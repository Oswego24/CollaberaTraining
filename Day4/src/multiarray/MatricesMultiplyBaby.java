package multiarray;

public class MatricesMultiplyBaby {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int b[][]= {{1,2,3},{1,2,3},{1,2,3}};
		
		multiplyMatrices(a, b);

	}

	public static void multiplyMatrices(int[][] a, int[][] b) {
		
		int c[][]= new int[a.length][a[0].length];
		int d[][]= new int[a.length][a[0].length];
		int e[][]= new int[a.length][a[0].length];
		int f[][]= new int[a.length][a[0].length];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				c[i][j] = a[0][0] * b[i][j];
				d[i][j] = a[0][1] * b[i][j];
				e[i][j] = a[0][2] * b[i][j];
				f[i][j] = c[i][j] + d[i][j] + e[i][j];
				System.out.print(f[i][j] + " ");
			}
			System.out.println();
		}
	}
}
