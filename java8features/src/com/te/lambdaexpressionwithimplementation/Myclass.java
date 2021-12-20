package com.te.lambdaexpressionwithimplementation;

import java.util.Iterator;

public class Myclass {
	public static void main(String[] args) {
		Test test = (i, j) -> {
			System.out.println(i + j);
		};
		test.add(10, 20);

		System.out.println("*************");
		Runnable run = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
			}
		};
		Thread thread = new Thread(run);
		thread.start();

	}
}