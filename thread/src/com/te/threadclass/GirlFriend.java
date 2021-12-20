package com.te.threadclass;

import java.util.Iterator;

public class GirlFriend extends Thread {
	Account account;

	public GirlFriend(Account accout) {
		super();
		this.account = accout;
	}
	@Override
public void run() {
	for (int i = 1; i < 10; i++) {
		account.deposit(100);
	}
System.out.println("GirlFriend completed deposits");
	}
	
}
