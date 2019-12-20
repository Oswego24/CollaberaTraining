package com.collabera.mysql;

public class BinarySearch {

	SortAlgorithm sortAlg;
	
	//Constructor or Getters and Setters
	
	BinarySearch(SortAlgorithm sortAlg){
		
		this.sortAlg = sortAlg;
	}


	public int search(int[] list, int value) {
		
		//sort
		//BubbleSort bSort = new BubbleSort();
		
		int[] sorted = sortAlg.sort(list);
		
	
		return 1;
	}
}
