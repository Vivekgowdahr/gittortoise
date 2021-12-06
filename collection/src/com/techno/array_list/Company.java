package com.techno.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Company {
	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList();
		Employee employee = new Employee(1, "vivek", 10001);// used to add the data and we cam do any number of data
		arrayList.add(employee);// calling the employee
		arrayList.add(new Employee(2, "Sushmitha", 1522));// use to add the employee
		arrayList.add(new Employee(3, "Yesh", 1552));
		System.out.println(arrayList.get(2));// to get the employee
		// to add the employee in b/w two employee
		arrayList.add(new Employee(10, "Advathi", 10000));// if we write in the diffrent like my name last and down on
															// top or wt ever it will take the order we give last one
															// will b in first as we diclaired
		for (Employee e : arrayList) {
			System.out.println(e);
		}
		System.out.println("******======================*****");
		Collections.sort(arrayList);
		for (Employee e : arrayList) {
			System.out.println(e);
		}
//		System.out.println("===============================");
//		Collections.sort(arrayList);
//		for (Employee e : arrayList) {
//			System.out.println(e);
//		}
//		
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
//		Collections.sort(arrayList,new SortingBySallaryCompair());
//		for (Employee e : arrayList) {
//			System.out.println(e);
//		}
//		Collections.sort(l);
	}
}
