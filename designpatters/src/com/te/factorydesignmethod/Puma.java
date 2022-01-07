package com.te.factorydesignmethod;

public class Puma implements Company{

	@Override
	public void tShirt() {
System.out.println("tShirt Starting from 19$");
		
	}

	@Override
	public void Shoes() {

		System.out.println("Shoes Starting from 29$");
	}

	@Override
	public void jeans() {
System.out.println("jeans Starting from 20$");
		
	}

}
