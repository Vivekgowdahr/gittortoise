package com.te.oop;

public class Student extends ResultEnc {
	public static void main(String[] args) {
		ResultEnc obj1 = new ResultEnc();
		ResultEnc obj2 = new ResultEnc();
		obj1.setName("Vivek");
		obj1.setStandard(10);
		obj1.setReselt("Pass");
		obj1.setPercentage(70);

		System.out.println("****************");

		obj1.getName();
		obj1.getStandard();
		obj1.getReselt();
		obj1.getPercentage();
		System.out.println("*****************");
		obj2.setName("Sushmitha");
		obj2.setReselt("pass");
		obj2.setPercentage(90);
		System.out.println("*****************");
		obj2.getName();
		obj2.getStandard();
		obj2.getReselt();
		obj2.getPercentage();

	}
}
