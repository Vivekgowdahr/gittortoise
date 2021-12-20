package com.te.AllOopInOne;

public class Object {
	int sal;
	int age;
	String name;
	public Object(int sal, int age, String name) {
		super();
		this.sal = sal;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Object [sal=" + sal + ", age=" + age + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		String string = new String("Vivek");
		String string2 = new String("Vivek");
//	if (string==string2) 
//		System.out.println("true");
//	else 
//		System.out.println("false");
		if (string.equals(string2))
			System.out.println("true");
		else
			System.out.println("false");
		System.out.println(string.hashCode());
		System.out.println(string2.hashCode());
		Object object = new Object(25, 50, "Vivek");
		System.out.println(object);
	}
}