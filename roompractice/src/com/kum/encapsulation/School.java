package com.kum.encapsulation;

public class School {
	public static void main(String[] args) {
		Student student = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		student.setName("Vivek");
		student.getName();
		student.setRollno(1);
		student.getRollno();
		student.setMarks(0);
		student.getMarks();
		student2.setName("Harish");
		student2.getName();
		student2.setRollno(2);
		student2.getRollno();
		student2.setMarks(-10);
		student2.getMarks();

	}
}
