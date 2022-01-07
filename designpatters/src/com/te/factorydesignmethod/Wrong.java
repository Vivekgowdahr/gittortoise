package com.te.factorydesignmethod;



public class Wrong implements Company {

	
	@Override
	public void tShirt() {

		System.out.println("tShirt Starts from 13$");
	}

	@Override
	public void Shoes() {
		System.out.println("Shoes Starts from 23$");
	}

	@Override
	public void jeans() {
		System.out.println("jeans Starts from 20$");
	}

}
