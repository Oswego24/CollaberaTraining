package com.collabera;

public class BinarySearchImpl {
	
	private SortAlgorithm sortAlgorithm;
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		//1. Sort array
		//2. Search array
		//3. Return result
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		//First step before searching is to sort an array
		return 0;
	}	
}
