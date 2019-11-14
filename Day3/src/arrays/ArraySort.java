package arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int[] myArray = {45,12,85,32,89,39,69,44,42,1,6,8};
		
		sortArray(myArray);
		
	}

	public static void sortArray(int[] myArray) {

		int temp;
		for(int i=0; i<myArray.length; i++) {
			for(int j=i; j>0; j--) {
				if(myArray[j] < myArray[j-1] ) {
					temp = myArray[j];
					myArray[j] = myArray[j-1];
					myArray[j-1] = temp;
					
				}
			}
		}
		for (int i=0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
			
		}
	}

}
