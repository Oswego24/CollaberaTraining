package arrays;

public class DiffLargestSmallest {

	public static void main(String[] args) {
		int[] array_nums = {5, 7, 2, 4, 9};
		
		int max_val = array_nums[0];
		int min = array_nums[0];
		for(int i = 1; i < array_nums.length; i++) {
			if(array_nums[i] > max_val)
				max_val = array_nums[i];
			else if(array_nums[i] < min)
				min = array_nums[i];
		}
		System.out.println("Diff largest and smallest : " +(max_val-min));
	}

}
