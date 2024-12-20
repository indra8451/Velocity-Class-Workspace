package Assigment18.program2;

/*2. Suppose you have array that containing elements 10,20,30,10, 30,50,60.
   Find out duplicate elements into array and print it.*/

public class DuplicateNoInArray {
	
	public void duplicateNoInArray(int arr[]) {
		
		int element=0;
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++)
		{
			flag=false;
			element=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {
					
					flag=true;
					element=arr[i];
				}
				
			}
		
			if(flag==true)
			{
				System.out.println("Duplicate element in array "+element);
			}
		}
		
		
	}
	

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,10, 30,50,60};
		
		DuplicateNoInArray duplicateNoInarray= new DuplicateNoInArray();
		
		duplicateNoInarray.duplicateNoInArray(arr);

	}

}
