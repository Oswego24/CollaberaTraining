package streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.*;

public class StreamMap2 {

	public static void main(String[] args) {
		Map<String, String> books = new HashMap<>();
		books.put("978-0201633610", "Design patterns : elements of reusable object-oriented software");
		books.put("978-1617291999", "Java 8 in Action");
		books.put("978-0134685991", "Effective Java");
		
		
		//find the ISBN for the book with the title "Effective Java"
		
		Optional<String> oi = books.entrySet().stream()
				.filter(s -> "Effective Java".equals(s.getValue()))
				//.filter(s -> s.contains("Effective Java"))
				.map(Map.Entry::getKey)
				.findFirst();
		
		oi.ifPresent(System.out::println);
		
//		String book = "Effective Java";
//		
//		if(books.containsValue(book)) {
//			System.out.println(book);
//		}else {
//			System.out.println("Book not found");
//		}
	}

}
