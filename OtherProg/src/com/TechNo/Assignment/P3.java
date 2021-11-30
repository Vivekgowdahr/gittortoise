package com.TechNo.Assignment;

public  class P3 implements p1,P2
{

@Override
public void m1() {
	System.out.println("from m1");
	
}
public static void main(String[] args) 
{
	P3 obj = new P3();
	obj.m1();
}
}
