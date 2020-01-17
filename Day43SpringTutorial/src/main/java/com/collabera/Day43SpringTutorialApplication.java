package com.collabera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day43SpringTutorialApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println("Result of binary search: " + result);
		
		SpringApplication.run(Day43SpringTutorialApplication.class, args);
	}

}
