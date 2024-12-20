package com.interview.Java8interview_quetions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachCharacterOccurrences {

	
	 public static void main(String[] args) {
	        String input = "example";

	        // Using Java 8 streams to count character occurrences
	    
	        Map<Character, Long> map= input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(
	        													Function.identity(),//or s-> s
	        													Collectors.counting()
	        														
	        														));
	        
	        System.out.println(map);
	        												
	         }
}
