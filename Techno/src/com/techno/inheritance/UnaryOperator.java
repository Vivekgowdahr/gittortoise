package com.techno.inheritance;

public class UnaryOperator {

	public static void main(String[] args)
	{
	int x=111;
	int y=222;
	int z=x+y;
	
	System.out.println(~x++);
	System.out.println(~~x);
	System.out.println(~~~~y);
	System.out.println(~~~++z);
	System.out.println(~~~~~~~~z--);
	System.out.println();
	}

}
