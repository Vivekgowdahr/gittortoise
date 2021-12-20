package com.te.irctc;

public class Ticketbook {
int ticket=20;
public synchronized void BookTickets(int noOfTickets,String name) {
	
		System.out.println("Login Succesfful");
		System.out.println("welcome to IRCTC");
		System.out.println("Hello"+name);
		synchronized(this) {
		if (ticket< noOfTickets) {System.out.println("tickets are filled up");
		System.out.println("**************");
	}else {
		System.out.println(noOfTickets+"Ticket are avaliable");
	
		ticket=noOfTickets;
		System.out.println("the number of ticket left :"+ticket);
		System.out.println("*********************");
	}
}
		System.out.println("Thank you!");
		System.out.println("Thank you!");
}
}