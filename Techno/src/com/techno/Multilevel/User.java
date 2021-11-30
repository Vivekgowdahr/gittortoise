package com.techno.Multilevel;

public class User {

	public static void main(String[] args) 
	{
MessageRead messageRead = new MessageRead();
messageRead.text();
messageRead.textrecived();
messageRead.msgrecived();
System.out.println("**********");


MessageRecived messageRecived = new MessageRecived();
messageRecived.text();

messageRecived.textrecived();

	}

}
