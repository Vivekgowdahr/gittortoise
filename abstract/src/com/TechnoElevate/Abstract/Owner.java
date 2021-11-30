package com.TechnoElevate.Abstract;

public class Owner 
{
public static void main(String[] args) 
{
	Minnu minnu=new Minnu(40,20, "Labber") {
		
		@Override
		void eats() {
			// TODO Auto-generated method stub
			
		}
	};	
	minnu.bites();
	minnu.eat();
	minnu.sleeps();
	minnu.poop();
	System.out.println(minnu.nails);
	System.out.println(minnu.breed);
	System.out.println(minnu.weight);
	
	System.out.println("***********");
	Kittanu kittanu=new Kittanu(36, 10, "pitbull") {
		
		@Override
		void eats() {
			// TODO Auto-generated method stub
			
		}
	};
	kittanu.bites();
	kittanu.eat();
	kittanu.sleeps();
	kittanu.poop();
    System.out.println(kittanu.breed);
    System.out.println(kittanu.nails);
    System.out.println(kittanu.weight);
		
	
		
		
	
}
}
