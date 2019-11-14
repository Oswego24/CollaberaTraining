package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Create {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "Red");
		h.put(2, "Green");
		h.put(3, "Black");
		h.put(4, "White");
		h.put(5, "Blue");
		System.out.println("Size of the hash map: " + h.size());
		for(Map.Entry x : h.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}
		//remove all mappings
		h.clear();
		System.out.println("The New Map: " + h);
	}

}
