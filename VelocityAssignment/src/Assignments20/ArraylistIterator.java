package Assignments20;
/*1. Write program to add the five students mobile number into arraylist and iterate that elements using iterator. */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArraylistIterator {

	public void arraylistItr()
	{
			ArrayList arrList= new ArrayList();  //Given ArrayList can accept any object like String,Integer,Float
			
			System.out.println("Enter Five Mobile Number: ");
			
			for(int i=0;i<5;i++)
			{
				Scanner scanner= new Scanner(System.in);
				String mbno= scanner.next();
				arrList.add(mbno);
			}
			
		
			System.out.println("Iterating ArrayList using Iterator: ");
			
			Iterator itr=arrList.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		
	}
	
	public static void main(String[] args) {

		ArraylistIterator arrItr= new ArraylistIterator();
		
		arrItr.arraylistItr();

	}
}
