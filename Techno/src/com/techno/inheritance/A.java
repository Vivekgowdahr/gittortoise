package com.techno.inheritance;

public class A 
{
	int x;
	static int y;
	static int m1()
	{
		System.out.println("1st staic method A");

		return y;
		
	}
	static int m2()
	{
		System.out.println("2nd static method A");
		return y;
		
	}
	int m3()
	{
		System.out.println("1st non static method A");
		System.out.println(y);
		return x;
		
	}
	int m4()
	{
		System.out.println("2nt non static method A");
		return x;
	}
	
	
}
