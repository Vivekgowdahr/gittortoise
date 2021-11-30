package com.techno.inheritance;

public class B extends A
{
 static int m1() //This instance method cannot override the static method from A so we r making it as static
{
	System.out.println("from 1st static method B");
return 0;	
}
static  int  m2() //This instance method cannot override the static method from A so we r making it as static
 {
 	System.out.println("from 2st static method B");
 	return 0;
 }
int  m3()//This static method cannot hide the instance method from A so we r making it as non static
{
	System.out.println("from 1st non static method B");
	return 0;
}
int  m4()//This static method cannot hide the instance method from A so we r making it as non static
{
	System.out.println("from 2st non static method B");
	return 0;
}

}
