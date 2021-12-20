package com.te.threadclass;

public class Account {
	int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public void withdrow(int amount) {//we use ts bcs we need this methood to add thr ammount and for print it out
		if (balance < amount) {
			System.out.println("Insufficient Fund");
		} else {
			balance -= amount;//short hand and if we long hand tn it will b as balance=balance-amount
		}
	}

	synchronized public void deposit(int amount) {
		balance += amount;

	}
	public void checkBalance() {
		System.out.println(balance);
		
	}
}
