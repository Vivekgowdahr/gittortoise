package com.te.array_imp_program;

import java.util.Iterator;

public class Sortingh{
public static void main(String[] args) {
	int []a= {10,20,85,1,658,552,25};
	int temp;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if (a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}System.out.println("The length of the Array is :"+a.length);
	System.out.println(a[a.length-1]);
}

}
