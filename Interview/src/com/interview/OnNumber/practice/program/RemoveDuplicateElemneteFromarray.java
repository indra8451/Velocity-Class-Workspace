package com.interview.OnNumber.practice.program;

public class RemoveDuplicateElemneteFromarray {

	public static void removedup(int arr[]) {
       
		
		int rd=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]){
					arr[i]=0;
				}
			}
		}
		System.out.println("after removing");
		print1( arr);
	}
	
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println(arr[i]);
		}
		
	}
		public static void print1(int arr[]) {
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=0) {
					System.out.println(arr[i]);
				}
				
				
			}
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,13,1,4,5,7,8,1,6};
		System.out.println("before removing");
		print( arr);
		removedup(arr);

	}

}
