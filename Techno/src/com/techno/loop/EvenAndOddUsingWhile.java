package com.techno.loop;
import java.util.Scanner;
public class EvenAndOddUsingWhile 
{
public static void main(String[] args) 
{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the number");
	int i=obj.nextInt();
	
	int n=0;
	do 
	{
		if (i%2==0)
		{
			System.out.println(i+" is even number");
		}
		else 
		{
			System.out.println(i+"  is odd number ");
		}
		
	} 
	while(i<=n);
}
}
