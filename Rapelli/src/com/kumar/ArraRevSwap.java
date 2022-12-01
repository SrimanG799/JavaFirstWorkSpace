package com.kumar;

public class ArraRevSwap {
	public static void main(String[] args) {
		int[] A= {10,20,30,40,50,60,70,80,90};
		int l=A.length;
		for(int i=0;i<l/2;i++)
		{
			int temp=0;
			temp=A[i];
			A[i]=A[l-i-1];
			A[l-i-1]=temp;
			
			
		}
		
		for(int a:A)
		{
			System.out.print(a+" ");
		}
		}
	}


