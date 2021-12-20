package com.te.customeexce;

public class Mainexception {
public void wrongaccess ()throws YouAreNotEligable {
	System.out.println("Hello... sir");
	throw new YouAreNotEligable("you are not eligible");
}
public static void main(String[] args) {
	 Mainexception  mainexception = new  Mainexception();
	try {
		mainexception.wrongaccess();
	} catch (YouAreNotEligable e) {
System.out.println(e.message);
	} 
	}
}
