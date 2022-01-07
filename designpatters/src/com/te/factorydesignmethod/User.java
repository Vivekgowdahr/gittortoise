package com.te.factorydesignmethod;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Outlet outlet = new Outlet();
		Scanner scan =new Scanner(System.in);
		System.out.println("Sir....! which Brand are you searching.....????");
		String sc=scan.next();
		outlet.outlet(sc);

	}
}
