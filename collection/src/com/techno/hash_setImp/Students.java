package com.techno.hash_setImp;

public class Students {
	int roolNumber;
	String name;
	int marks;
	public Students(int roolNumber, String name, int marks) {
		super();
		this.roolNumber = roolNumber;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [roolNumber=" + roolNumber + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int hashCode() {	
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {	
		return super.equals(obj);
	}	
}