package hashset;

import java.util.*;

public class Clone {

	public static void main(String[] args) {
		//Create an empty HashSet
		HashSet<String> set = new HashSet<String>();
		//use add() method to add values in the hash set
		set.add("Red");
		set.add("Green");
		set.add("Black");
		set.add("White");
		set.add("Pink");
		set.add("Yellow");
		System.out.println("Original Hash Set: " + set);
		//Remove all elements that match the collection passed in
		//removeAll and clear act identically in this case 
		//Both clear or remove the entire set
		
		//set.remove("Green");
		//set.removeAll(set);
		
		//clear() method removes all the elements from a hash set
		//and the set becomes empty
		set.clear();
		System.out.println("Hash set after removing all the elements" + set);
	}

}
