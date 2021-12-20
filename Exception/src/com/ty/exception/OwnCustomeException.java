package com.ty.exception;

public class OwnCustomeException {
	public void happen() throws Blocked {
		System.out.println("Hello, Kutti");
		throw new Blocked("Your not eligibale to be my soulmate kutti.");
	}
	public static void main(String[] args) {
		OwnCustomeException customeException = new OwnCustomeException();
		try {
			customeException.happen();
		} catch (Blocked e) {
			System.out.println(e.message);
		}
	}
}