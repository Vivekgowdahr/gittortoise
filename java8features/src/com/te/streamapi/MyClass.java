package com.te.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyClass {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee(1, "Vivek", 23, 30000, "Developer"), // used to create the list
																								// and to add the list
																								// to the employe and we
																								// can write as bellow
				new Employee(2, "Sushmaitha", 20, 50000, "Ownear"), new Employee(3, "Harish", 25, 35020, "HR"),
				new Employee(4, "Sunitha", 40, 70000, "MD"));

		Employee e = list.get(0);
		for (int i = 0; i < list.size(); i++) {// we give list.sizd for list to ittertae but we give length in arry so
			if (e.getAge() > list.get(i).getAge()) { // wr should hs the above thing
				e = list.get(i);
			}
		}

		System.out.println(e);
		System.out.println("***************************************************");
		Stream<Employee> stream = list.stream();
		Optional<Employee> min = stream.min(Comparator.comparing(Employee::getSalary));// this is used by stream api and
																						// the above exicution of 7 line
																						// can b written innjust iine
																						// line but its deficult if wr
																						// do it will b good for u so we
																						// should practice
		System.out.println("************************************");
		list.stream().max(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println);// we can write the
																									// above 4 line
																									// programe in a
																									// singlr line and
																									// even we can print
																									// it
		System.out.println("******************************************************");
		List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		collect.forEach(System.out::println);

		System.out.println("************************************************************");
		List<Employee> collect1 = list.stream().sorted(Comparator.comparing(Employee::getAge))
				.collect(Collectors.toList());
		collect.forEach(System.out::println);

		System.out.println("************************************************************************");

		Map<String, List<Employee>> collect2 = list.stream().collect(Collectors.groupingBy(Employee::getDesignation));
		collect2.forEach((depaartment, emp) -> {
			System.out.println(depaartment);
			emp.forEach(System.out::println);
		});
		System.out.println("*******************************************************************");

		list.stream().filter(em -> em.getAge() > 20).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("******************************************//////////////////////////");
		boolean anyMatch = list.stream().anyMatch(em -> em.getAge() < 25);
		System.out.println(anyMatch);

	}
}
