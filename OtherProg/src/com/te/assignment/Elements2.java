package com.te.assignment;

import java.util.Iterator;
import java.util.Scanner;

public class Elements2 
{
	int [] meth(int a[])
{
	
	int c=a.length;
	if (c<=2)
	{
		System.out.println("The array elements are");
		for (int i = 0; i < a.length; i++) {
			
		}}
	else {
	for (int j = 0; j < a.length; j++) {
		
	}
	}return a;
	
	
}
public static void main(String[] args) 
{
Elements2 E = new Elements2();	 
Scanner n=new Scanner(System.in);
System.err.println("Enter the size of the array");
int x=n.nextInt();
System.out.println("enter the array elements");
int [] a= new int [x];
for (int i = 0; i < a.length; i++)
{
a[i]=n.nextInt();	
}
int b[]=E.meth(a);
for (int i = 0; i < b.length; i++) 
{
System.out.println(b[i]);	
}
}
}