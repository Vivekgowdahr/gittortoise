package com.te.array;

public class EvenOdd {
public static void main(String[] args) {
	int a[]= {100,58,96,5,36,91,28,52,5855};
	for (int i = 0; i < a.length; i++) {
		if (a[i]%2==0) 
			System.out.println(a[i]+": It is odd number");
		else 
			System.out.println(a[i]+": It is even number");
	}
}
}