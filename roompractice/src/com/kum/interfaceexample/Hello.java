package com.kum.interfaceexample;

public class Hello {
	public static void main(String[] args) {
		PhoneCall call1 = new Maharastra();
		PhoneCall call2 = new TamilNadu();
		PhoneCall call3 = new Karnataka();
		call1.busymessage();
		call2.busymessage();
		call3.busymessage();
		System.out.println("***********");
		call1.covidmessaage();
		call2.covidmessaage();
		call3.covidmessaage();

	}
}
