package com.te.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {
@Id
	private int id;
	private String name;
	private double salary;
	private String designation;

	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}

}
