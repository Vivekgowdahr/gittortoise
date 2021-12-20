package com.te.threadclass;

public class CtMain {
	public static void main(String[] args) {
		CreateThread createThread=new CreateThread();
		createThread.start();
		for (int i = 11; i <=20; i++) {
			System.out.println(i);
			createThread.getId();// to c the id of the thread and id can't b written or edited only read
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
