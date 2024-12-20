package com.interview.OnNumber.practice.program;

import java.util.Arrays;

public class SortString1and0 {

	public static void main(String[] args) {
		
		int arr[]={1,0,0,1,0,1,1,0,0,1};
		System.out.println("before sorting");
		System.out.println(Arrays.toString(arr));
		int left=0;
		int right=arr.length-1;
		
		while(left<right)
		{
			while(arr[left]==1 && left<right)
			{
				left++;
			}
			
			while(arr[right]==0 && left<right)
			{
				right--;
			}
			
			if(left<right )
			{
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				
			}
			
			left++;
			right--;
		}
		System.out.println("before sorting");
		System.out.println(Arrays.toString(arr));

	}

}
