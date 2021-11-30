package com.TY.array;

import java.util.Iterator;

public class OddEven {
	public static void main(String[] args) {
		int[] a = { 10, 20, 5, 86, 646, 646, 54, 586, 249, 245, 2 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				System.out.println(a[i] + " : is odd number");
			else
				System.out.println(a[i] + " : is even number");
		}
	}
}
