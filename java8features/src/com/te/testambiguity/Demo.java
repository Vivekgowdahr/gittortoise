package com.te.testambiguity;

public class Demo implements Test, Test2 {

	@Override
	public void m1() {
		System.out.println("From Demo"); // we use default bcs if we have common method with same method name and same
											// funcationality we can write in a single default method
	}

}
