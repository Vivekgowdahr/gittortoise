package com.te.array_imp_program;

public class Swapping {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6,7,52,8,9,10,11,12,13,14 };
	int swap=a[0];
		for (int i = 0; i < a.length; i++) {
			
				if (a[i]!=swap)
					 swap =a[i];
					a[i]=swap;
					
				}
			
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		
		}
		
	}
}
