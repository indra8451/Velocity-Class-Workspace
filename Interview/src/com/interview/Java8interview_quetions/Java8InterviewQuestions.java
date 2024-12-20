package com.interview.Java8interview_quetions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Java8InterviewQuestions  {

	public static void main(String[] args) {


		// Print the title to the console
        System.out.println("Top 25 Java 8 Coding Interview Questions and Answers.");
        
        // Initialize a list of integers with some duplicate values
        List<Integer> nums = Arrays.asList(100, 10, 4, 5, 6, 7, 8, 77, 50, 5, 10);
        
        // Question 1: Find the first element of the list using stream functions
        System.out.println("1) Given list of integers, find the first element of the list using stream functions:");
        
        // Convert the list to a stream, find the first element, and print it if present
        nums.stream()
            .findFirst() // This method returns an Optional containing the first element if it exists
            .ifPresent(System.out::println); // If the Optional contains a value, print it
        
        // Question 2: Find the total number of elements present in the list using stream functions
        System.out.println("2) Given list of integers, find the total number of elements present in the list using stream functions:");
        
        // Convert the list to a stream and count the number of elements
        long count = nums.stream()
            .count(); // The count method returns the total number of elements in the stream
        System.out.println(count); // Print the count
        
        // Question 4: Find all odd and even elements present in the list using stream functions
        System.out.println("4) Given list of integers, find all odd and even elements present in the list using stream functions:");
        
        // Find and print all even numbers in the list
        System.out.println("Even numbers:");
        nums.stream()
            .filter(n -> n % 2 == 0) // The filter method retains only even numbers
            .forEach(System.out::println); // Print each even number
        
        // Find and print all odd numbers in the list
        System.out.println("Odd numbers:");
        nums.stream()
            .filter(n -> n % 2 != 0) // The filter method retains only odd numbers
            .forEach(System.out::println); // Print each odd number
        
        // Question 5: Find the total number of elements starting with 5 in the list using stream functions
        System.out.println("5) Given list of integers, find the total number of elements starting with 5 in the list using stream functions:");
        
        // Convert each integer to a string, filter those starting with "5", and print them
        nums.stream()
            .filter(n -> n.toString().startsWith("5")) // Convert each number to a string and check if it starts with "5"
            .map(Integer::valueOf)
            .forEach(System.out::println); // Print each number that starts with "5"
        
        // Question 6: Find the total number of duplicate elements in the list using stream functions
        System.out.println("6) Given list of integers, find the total number of duplicate elements in the list using stream functions:");
        
        // Create a new HashSet to track unique elements
        Set<Integer> set = new HashSet<>();
        
        // Stream through the list of integers, filter out duplicates, and print them
        nums.stream()
            .filter(n -> !set.add(n)) // The add method returns false if the element is already in the set (i.e., it's a duplicate)
            .forEach(System.out::println); // Print each duplicate element
        
        // Question 8: Find the maximum and minimum elements in the list using stream functions
        System.out.println("8) Given list of integers, find the maximum and minimum elements in the list using stream functions:");
        
        // Find and print the maximum element in the list
        Optional<Integer> max = nums.stream()
            .max(Integer::compareTo); // The max method finds the maximum element based on natural order
        System.out.println("Max element: " + max.get()); // Print the maximum element
        
        // Find and print the minimum element in the list
        Optional<Integer> min = nums.stream()
            .min(Integer::compareTo); // The min method finds the minimum element based on natural order
        System.out.println("Min element: " + min.get()); // Print the minimum element
        
        System.out.println("9) Given list of integers, sort elements in the list in ascending order using stream functions:");
        nums.stream().sorted().forEach(System.out::println);
        
        System.out.println("10) Given list of integers, sort elements in the list in Descending order using stream functions:");
        nums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	        
	}	

}
