package CollectionEnhancement.Stream_Concept.StreamCreationUsing_Collection;

import java.util.ArrayList;
import java.util.List;

public class StreamCreationUsingList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("pune");
		list.add("mumbai");
		list.add("bangalore");

		System.out.println("using lambda expression");
		list.stream().forEach(city -> System.out.println(city)); // using lambda

		System.out.println("\nusing method reference");
		list.stream().forEach(System.out::println); // using method reference

	}

}
