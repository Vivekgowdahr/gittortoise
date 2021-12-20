package com.te.streamapi;

public class Employee {
	int employeId;
	String name;
	int age;
	double salary;
	String designation;

	public Employee(int employeId, String name, int age, double salary, String designation) {
		super();
		this.employeId = employeId;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.designation = designation;
	}

	public int getEmployeId() {
		return employeId;
	}

	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employe [employeId=" + employeId + ", name=" + name + ", age=" + age + ", salary=" + salary
				+ ", designation=" + designation + "]";
	}

}
