package com.te.oop;

public class ResultEnc {
	private String name;
	private double percentage;
	private String Reselt;
	private static int Standard;
	
	public void getName() {
		System.out.println(name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getPercentage() {
		System.out.println(percentage);
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public void getReselt() {
		System.out.println(Reselt);
	}
	public void setReselt(String reselt) {
		Reselt = reselt;
	}
	public void getStandard() {
		 System.out.println(Standard);
	}
	public void setStandard(int standard) {
		Standard = standard;
	}

}
