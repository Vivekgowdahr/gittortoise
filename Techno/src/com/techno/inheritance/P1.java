package com.techno.inheritance;

public class P1 
{
int x=10;
int y=20;
P1()
{
	System.out.println("from constructor");
	}
P1(int x,int y)
{
	this.x=x;
	this.y=y;
	System.out.println(x);
}
public static void main(String[] args) 
{
	P1 obj=new P1();
	P1 obj2=new P1(10,20);
}
}
