package hmappractice;

import java.util.HashMap;
import java.util.Set;

public class MyHash {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "One");
		hmap.put(2, "Two");
		hmap.put(3, "Three");
		hmap.put(4, "Four");
		hmap.put(5, "Five");
		hmap.put(6, "Six");
		
		Set keyset = hmap.keySet();
		
		System.out.println(keyset);
		
	}
}
