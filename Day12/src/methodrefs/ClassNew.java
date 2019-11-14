package methodrefs;

import java.util.stream.*;
import java.util.*;

public class ClassNew {

	public static void main(String[] args) {
		//Stream of int from 1-19 -> println
		IntStream.range(1, 20).forEach(System.out::println);
		
		List<Integer> integers = IntStream
				.range(1, 100)
				.boxed()
				.collect(Collectors.toCollection(ArrayList::new));
		
		Optional<Integer> max = integers.stream().reduce(Math::max);
		
		max.ifPresent(System.out::println);

	}

}
