package Distinct;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Jane", "John", "Jake", "Jane");

		// Use distinct to remove duplicates
		names.stream().distinct().forEach(System.out::println); 
	}
}
