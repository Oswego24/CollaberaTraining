package streams;

import java.util.*;
import java.util.stream.*;

public class StreamsReduce3 {

	public static void main(String[] args) {
		// Creating list of integers
		List<Integer> array = Arrays.asList(-2,0,4,6,8,5,7,3,4,9);
		
		
		// Finding the sum of first 5 elements
		int sum = array.stream().limit(5).reduce(0,(element1, element2) -> element1 + element2);
																		  // -2 + 0 + 4 + 6 + 8
		
		// Displaying the sum of first 5 elements
		System.out.println("The sum of all elements is " + sum);
		
		// skip(n) returns a stream starting with element n
		List<Integer> array1 = array.stream().skip(7).collect(Collectors.toList());
		System.out.println(array1);

	}

}
