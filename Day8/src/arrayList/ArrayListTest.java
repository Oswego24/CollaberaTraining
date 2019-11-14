package arrayList;

import java.util.*;

public class ArrayListTest {
	
	public static void main(String[] args) {
		List<Person> friends;
		Person person;
		
		friends = new ArrayList<Person>();
		
		person = new Person("Jane", 10, 'F');
		friends.add(person);
		person = new Person("Jack", 6, 'M');
		friends.add(person);
		
		Person p = friends.get(1);
		Person r = friends.get(0);
		System.out.println(p);
		System.out.println(r);
	}
}
