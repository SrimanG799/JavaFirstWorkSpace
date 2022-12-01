package com.exception;

public class Exception3 {
	
		
	public static void main(String[] args)
	{
		
	
	int[] A= {4,2,1,9,4,6,8};
	
	
	System.out.println(A[0]);
	System.out.println(A[5]);
	System.out.println(A[1]);
	System.out.println(A[2]);
	System.out.println(A[3]);
	try
	{
	System.out.println(A[7]);
	
	System.out.println(A[9]);
	}
	catch( ArrayIndexOutOfBoundsException ae)
	{
		ae.printStackTrace();
	}
	System.out.println(A[1]);
	System.out.println(A[2]);
	

	
	System.out.println("welcome");
}
}