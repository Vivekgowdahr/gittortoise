package com.kum.interfaceexample;

public interface PhoneCall {
void busymessage();
default void covidmessaage() {
	
	System.out.println("Amitha bachhan is saying");
}
}
