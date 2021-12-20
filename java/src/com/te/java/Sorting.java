package com.te.java;

public class Sorting {
public static void main(String[] args) {
	int [] a= {10,0,64,25,69,2,64,2};
	int temp;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if (a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	System.out.println(a[a.length-1]);
}
}
