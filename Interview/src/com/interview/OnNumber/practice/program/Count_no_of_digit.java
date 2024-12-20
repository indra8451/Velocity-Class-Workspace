package com.interview.OnNumber.practice.program;

// count the no of digit
public class Count_no_of_digit {

	public static void main(String[] args) {
		
		int num=12754;
		int count=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}

		System.out.println(count);
	}

}
