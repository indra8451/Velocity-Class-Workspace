package com.interview.Java8interview_quetions;

// there is n number of natural no find the missing no from that
public class Find_Missing_no {
	
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,7,8,9,10,11,};
		
		// sum n naturals number n(n+1)/2 . here n=10 an 6 is missing
		
		int sum=(10*11)/2;
		int arr_sum=0;
		for(int i=0;i<arr.length;i++)
		{
			
			arr_sum=arr_sum+arr[i];
		}
		System.out.println(sum-arr_sum);
		
	}

}
