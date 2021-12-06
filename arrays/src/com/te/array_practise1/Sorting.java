package com.te.array_practise1;

import java.util.Iterator;

public class Sorting
{
	public static void main(String[] args)
	{
	int []a= {10,20,60,85,-1,45,-2365};
	for (int i = 0; i < a.length; i++) 
	{
		for (int j = 0; j < a.length; j++) 
		{
			if (a[i]<a[j]) 
			{
				int x=a[i];
				a[i]=a[j];
				a[j]=x;
						
			}
		}
	}
	for (int y:a) 
	{
		System.out.println(y);
	}
	System.out.println((a[a.length-2])+ " The 2nd higest number is") ;
	}
}