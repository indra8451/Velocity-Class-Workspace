package com.interview.OnNumber.practice.program;

//Import the Arrays class from the java.util package.
import java.util.*;

//Define a class named Exercise7.
public class RemoveElement {

 public int getIndex(int arr[],int val) {
	
	 int index = 0;
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i]==val)
		 {
			 index=i;
		 }
		 
	 }
	return index;
	 
	 
	 
 }
 public static void main(String[] args) {
	 RemoveElement rm=new RemoveElement();
	 
     int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

     
     System.out.println("Original Array : ");   
     System.out.println(Arrays.toString(my_array)); 

    
     System.out.println("Enter the Element to remove : ");
     Scanner scanner= new Scanner(System.in);
     int element=scanner.nextInt();
     
     int removeIndex =rm.getIndex(my_array,element);
     System.out.println(removeIndex);
   
     for (int i = removeIndex; i < my_array.length - 1; i++) {
         my_array[i] = my_array[i + 1];
     }
     
    
     System.out.println("After removing Array : ");   
     System.out.println(Arrays.toString(my_array));
 }
} 
