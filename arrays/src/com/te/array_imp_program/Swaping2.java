package com.te.array_imp_program;

public class Swaping2 {
	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60,70,80,90};
		for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			int temp;
			temp =a[i];
			a[i]=a[j];
			a[j]=temp;
		
		}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
}
