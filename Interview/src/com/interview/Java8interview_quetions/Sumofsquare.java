package com.interview.Java8interview_quetions;

import java.util.Arrays;

public class Sumofsquare {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		
	int sum=Arrays.stream(arr).map(s->s*s).sum();
	
	System.out.println(sum);
		
		
	}

}
