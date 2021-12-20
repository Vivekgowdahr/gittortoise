package com.te.lambdaexpressionwithimplementationandinsameclass;

public class MyClass{
public static int add(int x,int y)
{
	return x+y;
}
public int sub(int x,int y)
{
	return x-y;
}
public static void main(String[] args) {
	 Test test = new MyClass()::sub;//method referance for non static 
	 System.out.println(test.add(10,20));//to print
	 System.out.println("*******************"); 
	Test test2 = MyClass::add;//method referance for static
	System.out.println(test2.add(20, 10));// to print
	 
}
}
