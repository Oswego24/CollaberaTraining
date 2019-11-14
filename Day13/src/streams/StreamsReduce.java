package streams;

import java.util.*;

public class StreamsReduce {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Chuck", "Jim", "Brian", "Duane", "Alex" );
		
		Optional<String> reduced = names.stream()
				.reduce((s1,s2) -> s1 + "#" + s2); //reduce to single string stored as Optional
		
		reduced.ifPresent(System.out::println);

	}

}
