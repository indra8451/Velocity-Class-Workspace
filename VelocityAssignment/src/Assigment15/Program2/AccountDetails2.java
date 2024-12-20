package Assigment15.Program2;

//Using direct savingAcoount object

import java.util.Scanner;

public class AccountDetails2 {
    
    // Static variable to hold the withdrawal amount
    static int amount;
    
    // Method to get account details from the user
    public void getAccountDetails () {
        System.out.println("Enter the Account details:-");
        Scanner scanner = new Scanner(System.in);
        
        // Prompting user to enter account ID
        System.out.println("Enter the Account ID:-");
        int id = scanner.nextInt();
        
        // Prompting user to enter account number
        System.out.println("Enter the Account Number:-");
        int accountNumber = scanner.nextInt();
        
        // Prompting user to enter account balance
        System.out.println("Enter the balance :-");
        int balance = scanner.nextInt();
        
        // Creating an Account object with the entered details
        Account account = new Account(id, accountNumber, balance);
        
        // Printing account details before withdrawal
        System.out.println("Before withdrawal:- ");
        String acc = account.toString();
        System.out.println(acc);
        
        // Initializing saving account reference and handling withdrawal
        int Amount = getWithdrawDetails(account);
        
        // Checking if the withdrawal amount is more than the balance
        if(amount > account.getBalance()) {
            System.out.println("Insufficient balance.");
        } else {
            // Printing new account balance after successful withdrawal
            System.out.println("Withdrawal successful. New balance:\n " + account.toString());
        }
    }
    
    // Method to get withdrawal details and update the account balance
    public static int getWithdrawDetails(Account account) {
        System.out.println("Enter the withdrawAmount");
        Scanner scanner = new Scanner(System.in);
        amount = scanner.nextInt();
        
        // Creating a SavingAccount object with the withdrawal amount
        SavingAccount saving = new SavingAccount(amount);
        
        // Calculating the remaining balance after withdrawal
        int remaining_balance = account.getBalance() - saving.getWithdrawAmount();
        
        // Updating the account balance
        account.setBalance(remaining_balance);
        
        return remaining_balance;
    }
}

/*
Explanation of commented-out code:

Static Variable:
static SavingAccount saving;
- This declares a static variable `saving` of type `SavingAccount`.
- It means there will be only one instance of `saving` shared across all instances of `AccountDetails` 
  and it can be accessed using `AccountDetails.getSaving()`.

Getter and Setter:

getSaving() method is static and returns the `saving` object.
setSaving(SavingAccount saving) sets the `saving` object.
*/
