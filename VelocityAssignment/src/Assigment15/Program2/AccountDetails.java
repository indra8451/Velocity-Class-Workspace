package Assigment15.Program2;

//Use of aggregation of the SavingAccount class within the AccountDetails class

import java.util.Scanner;

public class AccountDetails {

    // Static variable to hold the SavingAccount object
    static SavingAccount saving;

    // Getter for the SavingAccount object
    public static SavingAccount getSaving() {
        return saving;
    }

    // Setter for the SavingAccount object
    public void setSaving(SavingAccount saving) {
        AccountDetails.saving = saving;
    }

    static int amount;

    // Method to get account details from the user
    public void getAccountDetails() {
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

        // Handling withdrawal
        int remainingBalance = getWithdrawDetails(account);

        // Checking if the withdrawal amount is more than the balance
        if (amount > account.getBalance()) {
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
        SavingAccount sa = new SavingAccount(amount);

        // Setting the SavingAccount object
        AccountDetails accountDe = new AccountDetails();
        accountDe.setSaving(sa);

        // Calculating the remaining balance after withdrawal
        int remaining_balance = account.getBalance() - AccountDetails.getSaving().getWithdrawAmount();

        // Updating the account balance
        account.setBalance(remaining_balance);

        return remaining_balance;
    }
}

/*
Static Variable:
static SavingAccount saving;
- Declares a static variable `saving` of type `SavingAccount`.
- This means there will be only one instance of `saving` shared across all instances of `AccountDetails` 
  and it can be accessed using `AccountDetails.getSaving()`.

Getter and Setter:
- `getSaving()` method is static and returns the `saving` object.
- `setSaving(SavingAccount saving)` sets the `saving` object.
*/
