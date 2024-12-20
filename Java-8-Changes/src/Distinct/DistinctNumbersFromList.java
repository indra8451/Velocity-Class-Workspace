package Distinct;

import java.util.Arrays;
import java.util.List;

public class DistinctNumbersFromList {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

		// Use distinct to remove duplicate numbers
		numbers.stream().distinct().forEach(System.out::println); 
	}

}
