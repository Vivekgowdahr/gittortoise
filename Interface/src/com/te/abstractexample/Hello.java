package com.te.abstractexample;

public class Hello {
	public static void main(String[] args) {
		PhoneCall phoneCall1 = new WhileCalling();
		PhoneCall phoneCall2 = new AfterCalling();
		phoneCall1.call();
		phoneCall1.covidMessage();
		phoneCall2.call();
		
	}
}
