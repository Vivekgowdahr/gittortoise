package com.te.array;

public class Swapping2 {
public static void main(String[] args) {
	int []a= {6,10,25,69,2595,2658,25,12,25};
	int temp;
	temp=a[0];
	a[0]=a[1];
	a[1]=temp;
	temp=a[2];
	a[2]=a[3];
	a[3]=temp;
	temp=a[4];
	a[4]=a[5];
	a[5]=temp;
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
