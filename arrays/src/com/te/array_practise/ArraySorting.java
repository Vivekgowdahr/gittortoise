package com.te.array_practise;

import java.util.Iterator;

public class ArraySorting
{
public static void main(String[] args) 
{
int []a= {10,20,80,-1,-50,-952,20,4115};
for (int i = 0; i < a.length; i++) 
{
for (int j = 0; j < a.length; j++)
{
	if (a[i]<a[j]) //> then it will b from greater to small
	{
	int low=a[i];	
	
	a[i]=a[j];
	a[j]=low;
	}

}	
}

for (int i = 0; i < a.length; i++) 
{
	System.out.println(a[i]);
}
System.out.println((a[a.length-2])+ " The 2nd greatest number ");


}
}
