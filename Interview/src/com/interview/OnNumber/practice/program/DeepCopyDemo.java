package com.interview.OnNumber.practice.program;

import java.util.Arrays;

public class DeepCopyDemo implements Cloneable{

	private int arr[];
	 
	 public DeepCopyDemo(int [] arr)
	 {
		 this.arr=arr;
	 }
	
	 public  DeepCopyDemo deepClone() throws CloneNotSupportedException {
		
		 DeepCopyDemo Demo= new DeepCopyDemo(arr);
		 Object clone= Demo.clone();
		 DeepCopyDemo Demo2=(DeepCopyDemo)clone;
		 Demo2.arr=this.arr.clone();
		 
		 return Demo2;
	 }
	
	public static void main(String[] args) throws CloneNotSupportedException {
	
		int arr[]= {1,2,3};
		
		DeepCopyDemo Demo= new DeepCopyDemo(arr);
		DeepCopyDemo Demo2 =Demo.deepClone()  ;                
		 Demo2.arr[0]=100;
		 System.out.println(Arrays.toString(Demo.arr));
		 System.out.println(Arrays.toString(Demo2.arr));
		
		
		

	}

}
