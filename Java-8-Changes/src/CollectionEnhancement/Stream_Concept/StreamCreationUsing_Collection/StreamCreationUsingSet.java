package CollectionEnhancement.Stream_Concept.StreamCreationUsing_Collection;

import java.util.HashSet;
import java.util.Set;

public class StreamCreationUsingSet{
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("pune");
		set.add("mumbai");
		set.add("bangalore");
		
		System.out.println("using lambda expression");
		set.stream().forEach(city -> System.out.println(city)); // using lambda

		System.out.println("\nusing method reference");
		set.stream().forEach(System.out::println); // using method reference

	}
	
}
