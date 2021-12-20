package com.te.irctc;

public class IrctApp {
public static void main(String[] args) {
	Ticketbook booking = new Ticketbook();
	Passenger vivek = new Passenger(booking, 10, " vivek");
	Passenger harish= new Passenger(booking, 5, " harish");
	Passenger sunitha = new Passenger(booking, 15, " sunitha");
	vivek.start();
	harish.start();
	sunitha.start();
	
}
}
