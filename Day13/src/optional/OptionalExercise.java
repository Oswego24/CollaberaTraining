package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalExercise {

	public static void main(String[] args) {
		List<Optional<String>> listOfOptionals = Arrays.asList(
				Optional.empty(), Optional.of("foo"), Optional.empty(), Optional.of("bar"));
		// - create a stream based on listOfOptionals
		// - filter list based on Optional having a value
		// - get the values from filtered Optional 
		// - collect them into a list
		// - display the final list
		List<String> list = listOfOptionals.stream()
			.filter(s -> !s.isEmpty())
			//.filter(Optional::IsPresent)
			.map(s -> s.get())
			//.map(Optional::get)
			.collect(Collectors.toList());
		System.out.println(list);
		//list.forEach(System.out::println);

	}

}
