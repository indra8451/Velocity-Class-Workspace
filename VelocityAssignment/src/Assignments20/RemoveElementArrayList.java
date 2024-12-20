package Assignments20;
import java.util.*;
import java.util.Scanner;

public class RemoveElementArrayList {

		public void arraylistRemoveElement() {
			
			ArrayList<String> arrList= new ArrayList<String>();
			
			System.out.println("Enter Five city name: ");
			for(int i=0;i<5;i++)
			{
				Scanner scanner= new Scanner(System.in);
				String city= scanner.next();
				arrList.add(city);
			}
			
			printArralist(arrList);
			
			System.out.println("Enter city name to remove: ");
			Scanner scanner = new Scanner(System.in); 
			String name= scanner.next();
			
			arrList.remove(name);
			
			System.out.println("After Removing city name: ");
			printArralist(arrList);
		}
		
		public void printArralist(ArrayList<String> arrList) {
			System.out.println("List Data>>>>>>>>>");
			for(String city:arrList)
			{
				System.out.println(city);
			}
		}
		
		public static void main(String[] args) {
			RemoveElementArrayList arrFor= new RemoveElementArrayList();
			
			arrFor.arraylistRemoveElement();

		}
	}
		
