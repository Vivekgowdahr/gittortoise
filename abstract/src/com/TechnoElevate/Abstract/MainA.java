package com.TechnoElevate.Abstract;

public class MainA 
{
public static void main(String[] args) 
{
	//Test2 test2 = new Test2();
	//test2.m1();
/*
 * upcasting -
 */
 
Test test=new Test2();
test.m1();
//downCasting
Test2 test2 = (Test2) test;
test.m2();

//Test test=new Test();
test.m1();
}
}
