package com.TE.Exception;

public class Throws 
{
public void bushan() //throws Exception// used to throw the exception 
{
	System.out.println("I didnt do it ");
	throw new ArrayIndexOutOfBoundsException();// it throws an exeption which will not b tare but we can create it
//throw new Exception();// Exception is created and thrown to the main method
}
public static void main(String[] args) {
	System.out.println("Who has done it");
	Throws td=new Throws();
	//try{// exeption is handled
	td.bushan();
	//}catch (Exception e){
	//System.out.println("Exception occured");
	//}
}
}
