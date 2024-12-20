package Assigment12.program1;

import java.util.Scanner;

public class SavingAccount extends Account
{
 
	String accountType;
	long balance;
	
	
	public void getSavingAccountDetails() {
		
		System.out.println("Enter the accountType and balance :-");
		Scanner scanner = new Scanner(System.in);
		
		accountType=scanner.next();
		balance=scanner.nextLong();
		
		getSavingAccountInformation(accountType,balance);
		
		
	}
	
	public void getSavingAccountInformation(String accType,long bal)
	{
		
		System.out.println("Account Type>>" + accType);
		System.out.println("Account Balance>>" + bal);
	}
	
	
}
