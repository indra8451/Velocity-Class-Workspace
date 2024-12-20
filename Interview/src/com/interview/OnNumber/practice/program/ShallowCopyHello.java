package com.interview.OnNumber.practice.program;

import java.util.Arrays;

public class ShallowCopyHello implements Cloneable {

	 private int arr[];
	 
	 public ShallowCopyHello(int [] arr)
	 {
		 this.arr=arr;
	 }
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
	
		int arr[]= {1,2,3};
		
		ShallowCopyHello hello= new ShallowCopyHello(arr);
		ShallowCopyHello hello2= (ShallowCopyHello) hello.clone();
		 hello2.arr[0]=98;
		 System.out.println(Arrays.toString(hello.arr));
		 System.out.println(Arrays.toString(hello2.arr));
		
		
		

	}

}
