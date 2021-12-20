package com.te.assignment;

public class Var 
{
public int add(int...x) 
{
	int res=0;
	for (int i = 0; i < x.length; i++) 
	{
		res+=x[i];
	}
return res;
}
public static void main(String[] args) 
{
var obj = new Var();
int sum=obj.add(10,20,40,50,60);
System.out.println(sum);
}
}
