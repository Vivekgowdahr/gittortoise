package com.te.abstract1;

public abstract  class Kittanu extends Cat
{
	 public Kittanu(double weight, int nails, String breed) {
		super(weight, nails, breed);
		// TODO Auto-generated constructor stub
	}
	void sleeps()
	{
	System.out.println("Just like me");	
	}
	public void eat() 
	{
		System.out.println("we give");
	}
	public void bites() 
	{
		System.out.println("still not");
	}
}
