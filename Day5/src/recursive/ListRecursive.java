package recursive;

public class ListRecursive {

	public static void main(String[] args) {

		listNumbers(1,100);
	}

	public static void listNumbers(int i, int j) {
		
		System.out.print(i + " ");
		
		if(i==j) return;
		listNumbers(i+1, j);
	}

}
