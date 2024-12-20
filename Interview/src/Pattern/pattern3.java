package Pattern;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		System.out.println("enter the no:-");
		Scanner scannner= new Scanner(System.in);
		int no= scannner.nextInt();
	
	
	        int left = no - 1; // Initial left position
	        int right = no - 1; // Initial right position

	        for (int i = 0; i < no; i++) {
	            for (int j = 0; j < no * 2 - 1; j++) {
	                if ((j > left) && (j < right)) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print(""); // Print two spaces for each position
	                }
	            }

	            System.out.println();
	            left--;
	            right++;
		
		
		
		  /*//int no = 5; // Number of rows
	        int left = no - 1; // Initial left position
	        int right = no - 1; // Initial right position

	        for (int i = 0; i < no; i++) {
	            for (int j = 0; j < no * 2 - 1; j++) {
	                if (j >= left && j <= right && (j - left) % 2 == 0) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	            left--;
	            right++;*/
	
		        }
		    }
		
}
		
		
		
	

