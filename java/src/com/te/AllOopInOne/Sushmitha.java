package com.te.AllOopInOne;

public abstract class Sushmitha implements Activity {
	public abstract void sleep();

	private String notalent;
	private double sal;

	public Sushmitha(String notalent, double sal) {
		super();
		this.notalent = notalent;
		this.sal = sal;
	}

	@Override
	public void sing() {
		System.out.println("singingggggg");
	}

	public void getNotalent() {
		System.out.println(notalent);
	}

	public void getSal() {
		System.out.println(sal);
	}

	@Override
 	public void dancing() {
		System.out.println("dancingggg");
	}

	@Override
	public void playing() {
		System.out.println("playing");
	}

	@Override
	public void eating() {
		System.out.println("eating");

	}

	@Override
	public String toString() {
		return "Sushmitha [notalent=" + notalent + ", sal=" + sal + "]";
	}

}
