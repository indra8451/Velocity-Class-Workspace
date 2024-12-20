package Assignments20;

import java.util.ArrayList;
import java.util.Scanner;

/* 2.Design the generics arraylist for string and add five cities into it and iterate that using for each loop.*/

public class ArraylistForEachLoop {

	public void arraylistForEachLoop() {
		
		ArrayList<String> arrList= new ArrayList<String>();
		
		System.out.println("Enter Five city name: ");
		for(int i=0;i<5;i++)
		{
			Scanner scanner= new Scanner(System.in);
			String city= scanner.next();
			arrList.add(city);
		}
		
		System.out.println("Iterating ArrayList using for each loop: ");
		for(String city:arrList)
		{
			System.out.println(city);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		ArraylistForEachLoop arrFor= new ArraylistForEachLoop();
		
		arrFor.arraylistForEachLoop();


	}

}
