package com.ty.string;

public class TypeOfMethodsInString {
	public static void main(String[] args) {
		String name = "My name is Vivek";
		name = name.toUpperCase();
		String s = new String("Vivek");
		String s1 = new String("vivek");
		System.out.println(s.equals(s1));
		System.out.println(s.charAt(1));

		System.out.println(name.length());
		System.out.println(name);
		String[] name1 = name.split("A");
		for (String x : name1) {
			System.out.println(x);
		}
	}
}
