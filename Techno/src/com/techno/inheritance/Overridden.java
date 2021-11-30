package com.techno.inheritance;

public class Overridden extends MethodOverriding
{
	public void test()
	{
	System.out.println("From test of Overridden");
	}

public static void main(String[] args) 
{
	Overridden overridden = new Overridden();
	overridden.test();
	System.out.println(".......");
	MethodOverriding MethodOverriding=overridden;
	MethodOverriding.test();
			
}
		
	
}
