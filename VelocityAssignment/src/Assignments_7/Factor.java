package Assignments_7;

import java.util.Scanner;

/**
 * This class calculates and prints the factors of a given number.
 */
public class Factor {
    
   
    public static void factor(int value) {
        int i = 1; 
        
        
        while (i <= value) {
            if (value % i == 0) {  
                System.out.println(i);  
            }
            i++;  
        }
    }

    
    public static void main(String[] args) {
        System.out.println("enter the number");  
        
        Scanner sobj = new Scanner(System.in);  
        int value = sobj.nextInt();  
        
        Factor.factor(value);  
        
        
    }

}
