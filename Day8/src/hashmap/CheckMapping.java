package hashmap;

import java.util.HashMap;

public class CheckMapping {

	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("Red", 1);
		h.put("Green", 2);
		h.put("Black", 3);
		h.put("White", 4);
		h.put("Blue", 5);
		//Toggle the comment below if you want the key to exist
		//h.put("Orange", 6);
		
		//print the map
		System.out.println("The original map: " + h);
		System.out.println("1. Does key 'Green' exist? ");
		if(h.containsKey("Green")) {
			//key exists
			System.out.println("Yes! - " + h.get("Green"));
		}else {
			//key does not exist
			System.out.println("No!");
		}
		System.out.println("\n2. Does key 'Orange' exist?");
		if(h.containsKey("Orange")){
			System.out.println("Yes! - " + h.get("Orange"));
		}else {
			System.out.println("No!");
		}
	}
}
