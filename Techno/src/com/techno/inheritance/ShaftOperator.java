package com.techno.inheritance;

public class ShaftOperator {

	public static void main(String[] args)
	{
		int x=16;
		// number*2^n
		//10*(2*2*2) as we have 3 in the sop stmt if we had 2 10(2*2)
		System.out.println(x<<3);
		String s=(x<<3>=129)?("it is greater"):("it is smaller");
		System.out.println(s);

	}

}
