package Assigment14;
/*
 1.Write a java program to print the all multiplication table from * 2, 3, 4.... to 20.
 */

public class MultiplicationTable {

	public static void main(String[] args) {
		
		System.out.println("Multiplication Table 2 to 20:- ");
		
		for(int i=2;i<=20;i++)
		{
			System.out.println(">>>>>>>>>>>>>>>>"+" Multiplication Table of"+" "+i+"<<<<<<<<<<<<<<<<<<<<");
			for(int j=1;j<=10;j++)
			{
				System.out.println(i*j);
			}
		
		}

	}

}
