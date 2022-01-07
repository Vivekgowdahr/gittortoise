package com.te.factorydesignmethod;

public class Nike implements Company {

	@Override
	public void tShirt() {
System.out.println("tShirt Starts from 12$");
		
	}

	@Override
	public void Shoes() {
		System.out.println("Shoes Starts from 9$");
		
	}

	@Override
	public void jeans() {

		System.out.println("jeans Starts from 26$");
	}

}
