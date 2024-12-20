package Assigment15.Program2;

public class Account {
	
	int id;
	long accountNumber ;
	int balance;
	
	
	public Account(int id, long accountNumber, int balance) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public int getId() {
		return id;
	}


	public long getAccountNumber() {
		return accountNumber;
	}


	public int getBalance() {
		return balance;
	}
	
	
	
   

}
