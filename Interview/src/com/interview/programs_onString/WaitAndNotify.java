package com.interview.programs_onString;

// Customer class to handle deposit and withdraw operations
class Customer {
    int amount = 10000; // Initial amount in the account

    // Synchronized method to withdraw amount
    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw...");

        // Check if there is enough balance to withdraw
        if (this.amount < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                // Wait until notify() is called
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Deduct the amount from balance
        this.amount -= amount;
        System.out.println("withdraw completed...");
    }

    // Synchronized method to deposit amount
    synchronized void deposit(int amount) {
        System.out.println("going to deposit...");
        // Add the amount to balance
        this.amount += amount;
        System.out.println("deposit completed... ");
        // Notify any waiting thread that it can proceed
        notify();
    }
}

// WithdrawTask class to perform withdrawal in a separate thread
class WithdrawTask implements Runnable {
    private Customer customer;
    private int amount;

    // Constructor to initialize customer and amount
    WithdrawTask(Customer customer, int amount) {
        this.customer = customer;
        this.amount = amount;
    }

    // Run method to call withdraw method of customer
    public void run() {
        customer.withdraw(amount);
    }
}

// DepositTask class to perform deposit in a separate thread
class DepositTask implements Runnable {
    private Customer customer;
    private int amount;

    // Constructor to initialize customer and amount
    DepositTask(Customer customer, int amount) {
        this.customer = customer;
        this.amount = amount;
    }

    // Run method to call deposit method of customer
    public void run() {
        customer.deposit(amount);
    }
}

// Main class to test the Customer, WithdrawTask, and DepositTask classes
class WaitAndNotify {
    public static void main(String args[]) {
        // Create a Customer instance
        Customer c = new Customer();

        // Create and start a thread to withdraw money
        Thread withdrawThread = new Thread(new WithdrawTask(c, 15000));
        // Create and start a thread to deposit money
        Thread depositThread = new Thread(new DepositTask(c, 10000));

        withdrawThread.start(); // Start the withdraw thread
        depositThread.start(); // Start the deposit thread
    }
}
