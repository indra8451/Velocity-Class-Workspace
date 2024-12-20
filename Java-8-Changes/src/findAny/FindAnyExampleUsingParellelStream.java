package findAny;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyExampleUsingParellelStream {

	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "custardApple", "cherry", "date","coconut");

		// Find any word that starts with 'c'
		Optional<String> wordStartingWithC = words.parallelStream().filter(word -> word.startsWith("c")).findAny();

		if (wordStartingWithC.isPresent()) {
			System.out.println("Found a word starting with 'c': " + wordStartingWithC.get());
		} else {
			System.out.println("No word starts with 'c'.");
		}
	}
}
