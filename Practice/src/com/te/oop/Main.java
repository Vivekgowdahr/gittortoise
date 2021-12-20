package com.te.oop;

public class Main implements FirstInt, SecondInt {
	public void test1() {
		System.out.println("from test 1");
	}

	@Override
	public void test2() {
		System.out.println("from test 2");

	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.test1();
		obj.test2();
		FirstInt obj2 = obj;
		obj2.test1();
		SecondInt obj3 = (SecondInt) obj2;
		obj3.test2();

	}
}
