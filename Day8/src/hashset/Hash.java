package hashset;

import java.util.*;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet <String>();
		set.add("Red");
		set.add("Green");
		set.add("Green");  //ignores duplicate
		set.add("Black");
		set.add("White");
		set.add("Pink");
		set.add("Yellow");
		
		set.remove("Pink");
		//set Iterator
		Iterator<String> p = set.iterator();
		//Iterate the hash set
		while(p.hasNext()) {
			System.out.println(p.next());
		}
	}
}
