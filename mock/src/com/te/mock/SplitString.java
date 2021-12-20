package com.te.mock;

import java.util.Iterator;
import java.util.Scanner;

public class SplitString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String a=sc.nextLine();
	System.out.println("Required split");
	int b=sc.nextInt();
	System.out.println("Required word to split");
	String c=sc.next();
	String[] d=a.split(c, b);
	for (String e : d) {
	System.out.println(e);	

}
}
}
