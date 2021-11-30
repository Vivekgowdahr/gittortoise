package com.techno.inheritance;

public class Switch 
{ 
	@SuppressWarnings("unused")
	public static void main(String [] args) 
	{
		int value;
		switch (value=2) {
		case 1:
			System.out.println("from1");
			break;
		case 2:
			System.out.println("from2");
			break;
		case 3:
			System.out.println("from3");
			break;
		default:
		
			System.out.println("default");
		}
	}

}
