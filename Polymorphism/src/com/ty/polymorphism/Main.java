package com.ty.polymorphism;

public class Main {
	public static void main(String[] args) {
		Test test = new Test();
		test.m1();
		System.out.println(test.x);
		System.out.println("******");
		Demo demo = new Demo();
		demo.m1();
		System.out.println(demo.x);
		System.out.println("*******");
		Test t = new Demo();
		t.m1();
		System.out.println(t.x);
	}
}