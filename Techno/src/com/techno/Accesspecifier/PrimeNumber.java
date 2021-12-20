package com.techno.accesspecifier;



public class PrimeNumber {
	public static boolean isprime(int n) {
		for (int i = 2; i < n; i++) {
			if (i%n==0) {
				return false;
			}

		}
		return true;

	}

	public static void main(String[] args) {
	int num1= 2;
	int num2=20;
	for (int i = num1; i <= num2; i++) {
		if (isprime(i)) {
			System.out.println(i +": is prime number");
		}
	}

	}
}
