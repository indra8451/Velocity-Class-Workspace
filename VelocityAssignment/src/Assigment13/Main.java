package Assigment13;

import java.util.Scanner;

interface Account
		{
			
			public void getSavingAccount();
			public void getUserDetails(String name,float balance); 
		
		}
		 class AccountImpl implements Account
		{

			@Override
			public void getSavingAccount() 
			{
				System.out.println("Enter the Name ans Balence:- ");
				Scanner scanner= new Scanner(System.in);
				String name=scanner.next();
				float balance=scanner.nextFloat();
				
				getUserDetails(name, balance);
				
					
			}

			@Override
			public void getUserDetails(String name, float balance) 
			{
				System.out.println("User name is "+ name+ " Balence is "+ balance);
				
			}		
		}

		public class Main {
		
			public static void main(String[] args) {
				AccountImpl accountimple = new AccountImpl();
				accountimple.getSavingAccount();
		
			}
		
		}
