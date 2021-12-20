package com.te.irctc;



public class Passenger extends Thread {

	Ticketbook book;
	int noOfTickets;
	String name;
//	public Passenger(Ticketbook book, int noOfTickets)
//	{
//		super();
//		this.book=book;
//		this.noOfTickets=noOfTickets;
//	}
	

public Passenger(Ticketbook book, int noOfTickets, String name) {
	super();
	this.book = book;
	this.noOfTickets = noOfTickets;
	this.name = name;
}
public void run() {
	book.BookTickets(noOfTickets, name);
	
}
}
