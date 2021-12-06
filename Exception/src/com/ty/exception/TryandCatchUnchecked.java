package com.ty.exception;

import java.util.Scanner;

public class TryandCatchUnchecked {
	public static void main(String[] args) {
		int x, y;
		System.out.println("enter the number 1");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		System.out.println("enter the second number");
		y = scan.nextInt();
		try {
			int result = x / y;
			System.out.println(result);

		} catch (ArithmeticException e) {
			System.out.println("Infinite");
		}

	}
}
