package com.interview.Java8interview_quetions;

import java.util.Arrays;
import java.util.List;

public class Word_occurences {

	public static void main(String[] args) {

		 List <String> words= Arrays.asList("apple","mango","orange","bannan","jery","mango");
		 
		long count=   words.stream().filter(word-> word.equals("mango")).count();
		
		System.out.println("occurensecse of mango is :-" + count);

	}

}
