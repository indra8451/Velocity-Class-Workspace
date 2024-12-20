package Reduce;

import java.util.Arrays;

public class ReduceExamplewithoutIntialValue {
	
	public static void main(String[] args) {
		
		int arr[]= {1,45,3,2};
		
		int sum1=Arrays.stream(arr).reduce(0,Integer::sum);
		
		System.out.println("Addition of numbers using Method Referensce: "+sum1);
		
		int sum=Arrays.stream(arr).reduce(0,(a,b)->a+b);
		
		System.out.println("Addition of numbers using lambda expression: "+sum);

	}
	
}
