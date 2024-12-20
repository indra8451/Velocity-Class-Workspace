package Assigment12.program1;

import java.util.Scanner;

public class Account {
	
	int accountNumber;
	String accountName;
	
	
	public void getAccountDetails()
	{
		System.out.println("Enter the AccountNumber and AccountName :-");
		Scanner scanner = new Scanner(System.in);
		
		accountNumber=scanner.nextInt();
		accountName=scanner.next();
		
		getAccountInformation(accountNumber,accountName);
		
	}
	
	
	public void getAccountInformation(int accNo,String accName) 
	{
		
		System.out.println("Account Number>>" + accNo);
		System.out.println("Account Name>>" + accName);
		
	}

}
