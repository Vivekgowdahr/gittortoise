package com.te.array;

public class ReverseArray1 {
public static void main(String[] args) {
	int [] a = {10,20,90,72,68,63,25,78,25};
//	for (int i = a.length-1; i >= 0; i--) {
//		System.out.print(a[i]+" ");
	int j=a.length-1;
	int temp=0;
	for (int i = 0; i < a.length/2; i++) {
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		j--;
		
		
	}
for (int i = 0; i < a.length; i++) {
	System.out.print(a[i]+" ");
}

	}
}

