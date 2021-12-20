package com.te.array_imp_program;

public class ArraySorting 
{  
	public static void main(String[] args) 
	{
		String s1="vivek";
		s1="haris";
	int[] a = { 10, 20, 60, -259, 6225, 32556, 236, 62, 15, 0, 10 };
		System.out.println("The length of the array is " + a.length);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					int sort = a[i];
					a[i] = a[j];
					a[j] = sort;
				}
			}
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(a[a.length-2]+" is  the second largest number ");
	}
}