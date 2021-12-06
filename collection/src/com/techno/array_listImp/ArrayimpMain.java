package com.techno.array_listImp;

import java.util.Collections;
import java.util.Iterator;

public class ArrayimpMain {
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(2);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.remove(1);
		System.out.println(list.get(4));
		Iterator iterator = list.iterator();//calling iterator list will b the name given wile creating the object
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

		// System.out.println(list);

	}
}
