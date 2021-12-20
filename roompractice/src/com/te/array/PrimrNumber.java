package com.te.array;

import java.util.Scanner;

public class PrimrNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number u want to cheack");
	int num =sc.nextInt();
	boolean flag=false;
	for (int i = 1; i < num/2; i++) {
		if (num%i==0) {
			flag =true;
			break;
		}
	}
	if (!flag)
		System.out.println(num+" : is prime");
	else 
		System.out.println(num+" : is not prime");
}
}
