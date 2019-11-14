package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Iterate {

	public static void main(String[] args) {
		//Create a list and add the colors to it
		List<String> list_Strings = new ArrayList<String>();
		
		//Person p = new Person("Jack", 10, 'M');
		//list_Strings.add(p); //error
		
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		//print the list
		for(String elements : list_Strings) {
			System.out.println(elements);
			//System.out.println(list_Strings);
		}
	}

}
