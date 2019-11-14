package sets;

import java.util.Arrays;

//Merging two sets of data using addAll() method
//Input: a = [1,2,3,5,7,9], b = [0,2,4,5,6,8]
//Output: [1,2,3,4,5,6,7,8,9]


import java.util.Set;
import java.util.TreeSet;

public class MergeSet {
	
	//Function merging two sets of data using addAll() 
	public static <T> Set<T> mergeSet(Set<T> a, Set<T> b){
		//Creating an empty set Object
		Set<T> mergedSet = new TreeSet<T>();
		//Add the two sets to be merged into the new set
		mergedSet.addAll(a);
		mergedSet.addAll(b);
		return mergedSet;
		
	}

	public static void main(String[] args) {
		//Creating the sets to be merged
		//First set
		//Set<Integer> a = new HashMap<Integer>();
		Set<Integer> a = new TreeSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] {1,2,3,5,7,9}));
		//Second Set
		Set<Integer> b = new TreeSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] {0,2,4,5,6,8}));
		b.add(11);
		//Printing the sets
		System.out.println("Set a: " + a);
		System.out.println("Set b: " + b);
		//Calling mergeSets() function
		System.out.println("Merged set: " + mergeSet(a, b));

	}

}
