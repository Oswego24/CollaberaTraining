import java.util.Arrays;

public class ArraysSum {

	public static void main(String[] args) {
		int a =6;
		int b = 9;
		int[] firstArray = {1,3,5};
		int[] secondArray = {4,5,6,7,8,9};
		int[] thirdArray = {3,1,6,9,11};
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		boolean flag = true;
		
		//This particular stream is only viable in an ordered array
		System.out.println(Arrays.stream(new int[] {1,3,5,6,7,8,9,11})
				.filter(x -> x<6 || x>9)
				.sum());
		
		//first if says: if the index != 6 and flag == true, add and print
		//second if says: if the index == 6 our flag ==false, so everything after a won't add or print
		//third if says; if the index == 9 our flag == true again, so everything after b will add and print
		for(int i=0; i<firstArray.length; i++) {
			if(firstArray[i] != a && flag == true) {
				sum += firstArray[i];
			}else if(firstArray[i] == a){
				flag = false;
			}else if(firstArray[i] == b) {
				flag = true;
			}
			
		}
		System.out.println(sum);
		
		for(int i=0; i<secondArray.length; i++) {
			if(secondArray[i] != a && flag == true) {
				sum2 += secondArray[i];
			}else if(secondArray[i] == a){
				flag = false;
			}else if(secondArray[i] == b) {
				flag = true;
			}
			
		}
		System.out.println(sum2);
		
		for(int i=0; i<thirdArray.length; i++) {
			if(thirdArray[i] != a && flag == true) {
				sum3 += thirdArray[i];
			}else if(thirdArray[i] == a){
				flag = false;
			}else if(thirdArray[i] == b) {
				flag = true;
			}
			
		}
		System.out.println(sum3);
		
	}

}
