package com.te.runnableinter;

public class MainMy {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread currentThread = Thread.currentThread(); // Thread thread = new Thread(myThread); it is use to connect
														// with the thread
		currentThread.setName("Chotta Bheem");// it is used to set the name of the thread
		System.out.println("The nam eof the current thread is " + currentThread.getName());
		Thread thread = new Thread(myThread);
		thread.setName("Chutki");
		thread.getId();
		thread.start();
		System.out.println("the program is running");
	}
}
