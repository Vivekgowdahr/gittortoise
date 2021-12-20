package com.te.threadclass;

public class BoyFriend extends Thread {
	Account account;

	public BoyFriend(Account accout) {
		super();
		this.account = accout;
	}
	@Override
public void run() {
	for (int i = 1; i < 100; i++) {
		account.deposit(100);
	}
System.out.println("BoyFriend completed deposits");
	}
	
}

