package com.te.arraylist;
import java.util.*;

public class ArrayListimplem {


public static void main(String[] args) {
	ArrayList<String>  arrayList = new ArrayList<>();// used to create arraylist object
	arrayList.add("Vivek Gowda");// adding element to the list
	arrayList.add("Harish");
	arrayList.add("Raju");
	Iterator<String> iterator = arrayList.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
		
	}
}
}
