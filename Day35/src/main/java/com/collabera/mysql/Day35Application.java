package com.collabera.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class Day35Application {

	public static void main(String[] args) {
		//SpringApplication.run(Day35Application.class, args);
		
		//Console based
		//Swing [Deaktop based application]
		//Web Applications
		
		//BinarySearch 
		//Data should be sorted
		//Search Operation
		
		//Accept the input
		//value to search (parameter)
		
		int value = 2;
		BinarySearch bSearch;
		if(value == 2) {
			bSearch = new BinarySearch(new BubbleSort());
		}else {
			bSearch = new BinarySearch(new QuickSort());
		}
		bSearch = new BinarySearch(new BubbleSort());
		
		//To use bubble sort or quick sort before searching
		bSearch.search(new int[] {2,3,4,6}, 4);
	}

}
