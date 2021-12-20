package com.te.mock;

import java.util.Scanner;

public class Countvowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentance ");
		String a=sc.next();
		char []s=a.toCharArray();
		int count=0;
		for (int i= 0; i < s.length; i++) {
			
		
		if (s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='o') {
		count++;
		}
		}
		System.out.println(count);
	}
}