package com.te.threadclass;

public class CreateThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			if (i == 3) {
				throw new ArrayIndexOutOfBoundsException();// to create costome exception and
				// if we have exeption the one more thread will get exicuted in the main method
				// so we say the threads are independent in nature
				// and even after the exicution and error the other one complited its exicution
			}
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
