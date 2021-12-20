package com.te.lambdaexpression;

public class MyClass {
	public static void main(String[] args) {
		Test test = new Test() {

			@Override
			public void message() {
				System.out.println("Hello Buddy!!!");

			}
		};
		test.message();

		System.out.println("=========");
		Test test1 = () -> {
			System.out.println("Hi Guys!!!!!");
		};

		test1.message();

	}
}
