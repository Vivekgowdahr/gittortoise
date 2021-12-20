package com.te.the18assignment;

public class P9 {
	

	public static void getEvenDigitSum(int x){
		int sum=0;
		for(int i=1;i<x;i++){
			if(i%2==0){
				sum=sum+i;
			}
			
		}
		System.out.println(sum);

		
	}
	public static void main(String[] args) {
		
		getEvenDigitSum(20);
		
				}

}

