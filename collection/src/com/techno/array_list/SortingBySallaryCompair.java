package com.techno.array_list;

import java.util.Comparator;

public class SortingBySallaryCompair implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (int) (o1.salary-o2.salary);
	}

}
