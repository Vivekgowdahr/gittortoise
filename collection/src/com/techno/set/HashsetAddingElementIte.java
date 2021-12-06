package com.techno.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetAddingElementIte {
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(10);
		hashSet.add(1);
		hashSet.add(50);
		for (int x : hashSet)
			System.out.println(x);
		System.out.println("**********");
		Iterator<Integer> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
	
		}
	
		
	}
}
