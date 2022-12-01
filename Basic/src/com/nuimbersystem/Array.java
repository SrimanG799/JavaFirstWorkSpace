package com.nuimbersystem;

public class Array {
	public static void main(String[] args)
	{
		int[] A= {5,7,1,6,2,8,7};
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]);
		
		}
		System.out.println(" ");
		for(int i=A.length-1;i>=0;i--)
		{
			System.out.print(A[i]);
		}
	}

}
