package com.te.abstract1;

public abstract class Cat 
{
double weight;
int nails;
String breed;

abstract void sleeps();
public Cat(double weight, int nails, String breed) {
	super();
	this.weight = weight;
	this.nails = nails;
	this.breed = breed;
}
abstract void eats();
abstract void bites();
public void poop()
{
System.out.println("it poops");	
}
}
 	