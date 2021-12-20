package com.te.customeexce;

public class YouAreNotEligable extends RuntimeException{
String message;
public YouAreNotEligable(String message) {
	this.message=message;
}
}
