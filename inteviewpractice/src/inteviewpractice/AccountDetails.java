package inteviewpractice;

class Account {

	private int balence = 5000;

	public int getBalence() {
		return balence;
	}

	public  int withraw(int amount) {

		balence = balence - amount;
		return balence;
	}
}

public class AccountDetails implements Runnable {

	Account account = new Account();

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {

			doWithdrawal(500);

			if (account.getBalence() <= 0) {

				System.out.println("Account is overdrawn!!!!!!!!!!");
			}

		}

	}

	private synchronized void doWithdrawal(int amt) {

		if (account.getBalence() >= amt) {

			System.out.println(Thread.currentThread().getName() + " is going to withdraw");
		}

		int bal = account.withraw(amt);
		System.out.println(Thread.currentThread().getName() + " complete withdrawal=> " + bal);

	}

	public static void main(String[] args) {
		AccountDetails accountDetails = new AccountDetails();

		Thread thread1 = new Thread(accountDetails, "Indrajit");
		Thread thread2 = new Thread(accountDetails, "Pravin");

		thread1.start();
		thread2.start();
	}

}