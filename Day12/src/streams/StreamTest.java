package streams;

import java.util.Arrays;
import java.util.stream.*;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		
		List<String> filtered = list.stream()
					.filter(item -> !item.isEmpty())
					.collect(Collectors.toList());
		filtered.forEach(System.out::println);
		
		//list.stream().filter(item -> item.isEmpty()).forEach(System.out::println);
		
		List.of("This ", "is ", "created ", "by ", "List.of() ")
			.stream()
			.forEach(System.out::print);
		//Stream.of("This ", "is ", "created ", "by ", "stream() ").forEach(System.out::print);
	}

}
