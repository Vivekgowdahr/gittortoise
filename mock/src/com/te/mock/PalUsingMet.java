package com.te.mock;

import java.util.Scanner;

public class PalUsingMet {
public static void main(String[] args) {
	Scanner a= new Scanner(System.in);
	System.out.println("Enter the string");
	String b=a.nextLine();
	StringBuffer c =new StringBuffer(b);
	c.reverse();
	String d=c.toString();
	if (b.equals(d)) {
		System.out.println("itpal");
	} else {
System.out.println("it is no");
	}
	
}
}
