package com.exception;

public class ArrayEX {
	static int[] A= {4,7,8,6,2,1,7,8,3};
	static void get(int i)//throws ArrayIndexOutOfBoundsException
	{

		try {
		
		System.out.println(A[i]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) //throws ArrayIndexOutOfBoundsException
	{
		get(0);
		get(1);
		get(2);
		get(10);
		get(11);
		get(4);
		get(5);
		get(6);
	}

}
