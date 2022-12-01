package com.exc1;

public class ArrauBound2 {
	public static void main(String[] args) {
		
	
	int[] A= {2,8,5,8,3,5,9};
	try {
	for(int i=0;i<=10;i++)
	{
		System.out.println(A[i]);
	}
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		e.printStackTrace();
	}
	System.out.println("hello how eru");
	System.out.println("welcome to java");
	
}
}
