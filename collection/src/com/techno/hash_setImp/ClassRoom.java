package com.techno.hash_setImp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class ClassRoom {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet<>();
		Students students1 = new Students(45, "vivek", 72);
		Students students2 = new Students(10, "Sushmitha", 90);
		Students students3 = new Students(45, "Harish", 85);
		Students students4 = new Students(45, "Sunitha", 50);
		Students students5 = new Students(45, "Sunitha", 50);
		hashSet.add(students1);
		hashSet.add(students2);
		hashSet.add(students3);
		hashSet.add(students4);
		hashSet.add(students5);
		Iterator<Students> iterator = hashSet.iterator();
		while (iterator.hasNext()) 
			System.out.println(iterator.next());
		System.out.println("******************");
		ArrayList a=new ArrayList<>(hashSet);
		Collections.sort(a,new SortByName());
		Iterator<Students>ite = a.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		}
				
}