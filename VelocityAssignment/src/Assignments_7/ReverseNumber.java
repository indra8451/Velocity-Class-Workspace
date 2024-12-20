package Assignments_7;

import java.util.Scanner;

/**
 * This class calculates the reverse of a given number.
 */
public class ReverseNumber {

   
    public static int getReverseNumber(int num) {
        int reverseNo = 0;  
        while (num != 0)
        {
            int value = num % 10; 
            reverseNo = reverseNo * 10 + value;  
            num = num / 10;  
        }
        return reverseNo;  
    }

    
    public static void main(String[] args) {
        System.out.println("Enter the Number");  
        
        Scanner sobj = new Scanner(System.in);  
        int num = sobj.nextInt();  
        
        int reversedNo = ReverseNumber.getReverseNumber(num);  
        
        System.out.println("The reverse number is: " + reversedNo);  
        
         
    }

}
