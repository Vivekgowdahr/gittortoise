package com.te.encapsulation;

public class Mobile {
public static void main(String[] args) {
	BasicMobile basicMobile = new BasicMobile();
	basicMobile.brand="Karban";
	basicMobile.colour="Red";
	basicMobile.cost=2000;
	basicMobile.sim=2;
	basicMobile.text();
	basicMobile.call();
	System.out.println("**********************");
	SmartMobile smartMobile = new SmartMobile();
	smartMobile.call();
	smartMobile.pubg();
	smartMobile.surfing();
	smartMobile.text();
}
}
