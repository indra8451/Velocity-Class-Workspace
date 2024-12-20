package Assigment_10;

import java.util.Scanner;

/*
 3. Write java program to check whether number is Armstrong or not.
 (A positive number is called armstrong number if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc. 
 Let's try to understand why 153 is an Armstrong number.
	153 = (1*1*1)+(5*5*5)+(3*3*3)  
 
 */
public class ArmstrongNumber {
	
	public void check_Armstrong() {
		
		System.out.println("Enter the no:-");
		Scanner sobj= new Scanner(System.in);
		int num= sobj.nextInt();
		int sum=0;
		int cube=0;
		int original_no=num;
		while(num!=0)
		{
			cube=0;
			int no=num%10;
			cube=no*no*no;
			sum=sum+cube;
			num=num/10;
		}
		
		if(sum==original_no)
		{
			System.out.println("Given Number is Armstrong");
		}
		else
		{
			System.out.println("Given Number is not Armstrong");
			
		}
		
		
	}

	public static void main(String[] args) {
		
		ArmstrongNumber am=new ArmstrongNumber();
		
		am.check_Armstrong();

		
	}

}
