package hashset;

import java.util.*;

public class Convert {

	public static void main(String[] args) {
		//Create an empty hash set
		HashSet<String> set = new HashSet<String>();
		//use add() method to add values in the hash set
		set.add("Red");
		set.add("Green");
		set.add("Black");
		set.add("White");
		set.add("Pink");
		set.add("Yellow");
		System.out.println("Original Hash Set: " + set);
		//Creating an array
		String[] array = new String[set.size()];
		set.toArray(array);
		
		//Displaying Array elements
		System.out.println("\nArray Elements: ");
		for(String element : array) {
			System.out.println(element);
		}
		
		//Create a TreeSet of HashSet elements
		Set<String> tree_set = new TreeSet<String>(set);
		
		//Display TreeSet elements
		System.out.println("\nTreeSet elements: ");
		for(String element : tree_set) {
			System.out.println(element);
		}
		
		//Create a List from HashSet elements
		List<String> list_set = new ArrayList<String>(set);
		
		//Display ArrayList elements
		System.out.println("\nArrayList elements: " + list_set);
	}
}

