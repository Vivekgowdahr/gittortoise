package com.TechnoElevate.Abstract;

public abstract class Chootu extends Cat
{
	public Chootu(double weight, int nails, String breed) {
		super(weight, nails, breed);
		// TODO Auto-generated constructor stub
	}
	public void sleeps()
	{
	System.out.println("Just like a Deman");	
	}
	public void eat() 
	{
		System.out.println("Chicken,milk,choko");
	}
	public void bites() 
	{
		System.out.println("always");
	}
}
