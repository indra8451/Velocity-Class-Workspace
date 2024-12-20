package Assignments21;

/*1. Design the method which return the list that contain the element as Ram, Sohan, Ashok, Ajay,
		Prasanna now I want to sort that element based on descending order.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class SortListDescending {
	
	public ArrayList<String> sortDesc(ArrayList<String> arrlist)
	{
		//The default order for the Collections.sort method in Java is ascending order.
		//Collections.reverseOrder() provides a comparator that sorts the list in descending order.
		
		Collections.sort(arrlist,Collections.reverseOrder());
		
		return arrlist;
	}
	
	public static void main(String[] args) {
		SortListDescending sortlistdesc= new SortListDescending();
		ArrayList<String> arrlist= new ArrayList<String>();
		System.out.println("Enter the count of name: ");
		Scanner scanner= new Scanner(System.in);
		int cnt=scanner.nextInt();
		
		System.out.println("Enter the "+cnt+" "+"names: ");
		for(int i=0;i<cnt;i++)
		{
			String name=scanner.next();
			arrlist.add(name);
		}
		
		 System.out.println("before sorting:-");
		 System.out.println(arrlist);
		 ArrayList<String> arrlist2=sortlistdesc.sortDesc(arrlist);
		 
		 System.out.println("After sorting:-");
		 System.out.println(arrlist2);
		
	}

	
	

}
