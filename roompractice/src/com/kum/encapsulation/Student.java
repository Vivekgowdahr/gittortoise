package com.kum.encapsulation;

public class Student {
int rollno;
String name;
private double marks;
public void getRollno() {
	System.out.println(rollno);
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public void getName() {
	System.out.println(name);
}
public void setName(String name) {
	this.name = name;
}
public void getMarks() {
	System.out.println(marks);
}
public void setMarks(double marks) {
	if (marks>=0) 
		this.marks = marks;
	else
		System.out.println("invalid marks");
}


}
