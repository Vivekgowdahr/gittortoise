package com.kum.abstractexample;

public abstract class Bike {
	Bike() {
		System.out.println("bike is created");
	}

	public abstract  void run();

	 void changeGear() {

		System.out.println("gear changed");
	}

}