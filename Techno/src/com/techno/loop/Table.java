package com.techno.loop;

import java.util.Iterator;
import java.util.Scanner;

public class Table 
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter number");
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c=0;
	    for(int i=1;i<=10;i++)
	    {
	    	int q=i*a;
	    	c=c+q;
	    	System.out.println(a+"X"+i+"="+q);
	    	System.out.println("reselt ="+c);
	    }
	    }
	}
