package methodrefs;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Test Method Ref ::println
 * 
 *
 */

public class MethodReferenceTest {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
			names.add("John");
			names.add("Jim");
			names.add("Jill");
			names.forEach(System.out::println);
			
			names.forEach(n -> System.out.println(n));
			//lambda with curly braces
			//names.forEach(n -> {System.out.println(n);});

	}

}
