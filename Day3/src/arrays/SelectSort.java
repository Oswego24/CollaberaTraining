package arrays;

public class SelectSort {

	public static void main(String[] args) {

		int[] myArray = {45,12,85,32,89,39,69,44,42,1,6,8};
		System.out.println("Before selection sort: ");
		for(int i:myArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		selectionSort(myArray);
		
		System.out.println("After selection sort: ");
		for(int i:myArray) {
			System.out.print(i + " ");
		}
	}

	private static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length - 1; i++) {
			int index = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[index]){
					index=j; //searching for the lowest index
				}

			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		
	}
	

}
