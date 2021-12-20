package com.te.array;

public class ReverseArray {
	public static void main(String[] args) {
int []a= {20,5,7,62,695,1,6,422};
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a.length; j++) {
		if (a[i]<a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
}
System.out.println(a[a.length-2]+" : is the second largest number");
	}

}