package com.exception;

public class ExcMeth {
	public static void div(int a,int b)
	{ 
		try {
		int res=a/b;
		System.out.println(res);
	}
	catch(ArithmeticException e)
	{
		e.printStackTrace();
	}
	}
	public static void main(String[] args) {
		div(15, 3);
		div(30,5);
		div(48,6);
		div(4,0);
		div(10,2);
		div(45,5);
		
	}

}
