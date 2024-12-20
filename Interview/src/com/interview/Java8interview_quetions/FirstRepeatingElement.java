package com.interview.Java8interview_quetions;

import java.util.HashSet;

public class FirstRepeatingElement {

	public static void main(String[] args) {
	
	/*	int arr[]= {3,5,6,3,5};
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					System.exit(0);
				}
			}
		}  */
		
		int arr[]= {3,5,6,3,5};
		
		HashSet<Integer> set =new HashSet<>();
		
		int flag=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(set.contains(arr[i]))
			{
				
				flag=i;
				break;
				
			}
			else
			{
				set.add(arr[i]);
			}
			
			
		}
		
		if(flag!=0)
		{
				
		}

	}

}
