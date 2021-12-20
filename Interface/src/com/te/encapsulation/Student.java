package com.te.encapsulation;

public class Student {
	private String name;
	private int roolNumber;
	private int marks;
	private String depeartment;
//	public Student(String name, int roolNumber, int marks, String depeartment) {
//		super();
//		this.name = name;
//		this.roolNumber = roolNumber;
//		this.marks = marks;
//		this.depeartment = depeartment;
//	}
	public void getName() {
		System.out.println(name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getRoolNumber() {
		System.out.println(roolNumber);
	}
	public void setRoolNumber(int roolNumber) {
		this.roolNumber = roolNumber;
	}
	public void getMarks() {
		System.out.println(marks);
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void getDepeartment() {
		System.out.println(depeartment);
	}
	public void setDepeartment(String depeartment) {
		this.depeartment = depeartment;
	}
	

}
