package com.te.array_practise;

public class ArrayGreatestNumberInAArray
{
public static void main(String[] args) 
{
	int[] a={10,20,30,40,90,5236,-1,0};// or we can declare as  int []a=new int[10]; then declare it 
    int larg=a[0];  //Reference variable
 for (int i = 0; i < a.length; i++) 
 {
	if (larg<a[i]) // for smallest declare >
	{
		larg=a[i];
	}

}
 System.out.println("The largest numbr is " +larg);
 
}
}
