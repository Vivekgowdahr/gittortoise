package com.techno.linked_list;
import java.util.Collections;
import java.util.LinkedList;

import com.techno.array_list.Employee;
public class Company {
public static void main(String[] args) {
	LinkedList<Employee> arraylist = new LinkedList<Employee>();
	arraylist.add(new Employee(1,"Vivek", 100));
	arraylist.add(new Employee(2, "Sushmitha", 10000));
	arraylist.add(new Employee(3, "Harish", 1000));
	arraylist.add(new Employee(4, "Sunitha", 100000));
	for (Employee e : arraylist) {
		System.out.println(e);
}
	System.out.println("******======================*****");
	Collections.sort(arraylist);
	for (Employee e : arraylist) {
		System.out.println(e);
	}
}
}