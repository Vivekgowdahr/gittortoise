package com.techno.array_listImp;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortingAndReverse {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(20);
		list.add(90);
		list.add(60);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}
}
