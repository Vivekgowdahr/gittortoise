package com.ty.exception;

public class StackOverFlowErrorunchecked {
	private static void m1() {
		System.out.println("from m1");
		m1();
	}

	public static void main(String[] args) {
		m1();// method recussion 
	}
}
