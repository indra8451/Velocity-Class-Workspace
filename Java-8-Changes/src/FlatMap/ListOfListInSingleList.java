package FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfListInSingleList {

	public static void main(String[] args) {

		/*
		 * List<List<String>> listOfLists = Arrays.asList(Arrays.asList("A", "B", "C"),
		 * Arrays.asList("D", "E", "F"), Arrays.asList("G", "H", "I"));
		 * 
		 */

		List<List<String>> listOfList = new ArrayList<List<String>>();

		listOfList.add(new ArrayList<String>(Arrays.asList("A", "B", "C", "D")));

		listOfList.add(new ArrayList<>(Arrays.asList("E", "F", "G", "H")));

		System.out.println("before Applying  Flatmap:");
		System.out.println(listOfList);

		// Adding lists with elements to listOfList
		listOfList.add(Arrays.asList("A", "B", "C", "D"));
		listOfList.add(Arrays.asList("E", "F", "G", "H"));

		System.out.println("\nafter Applying  Flatmap:");
		// Using flatMap with a lambda expression to flatten listOfList and print each element
		listOfList.stream().flatMap(list -> list.stream()) // Flatten each inner list into a single stream
				.forEach(element -> System.out.println(element)); // Print each element in the flattened stream

	}

}
