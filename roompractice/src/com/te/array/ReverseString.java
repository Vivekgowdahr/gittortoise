package com.te.array;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Enter the array");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] a = s.toCharArray();
		for (int i = a.length - 1; i >= 0; i--) {

			System.out.print(a[i]);
		}
	}
}