package com.overload;

public class Addreturn {
	int add(byte a,byte b)
	{
		return (int) (a+b);
	}
	int add(int a,int b)
	{
		return a+b;
	}
	short add(short a,short b)
	{
		return  (short) (a+b);
	}
	public static void main(String[] args)
	{
		Addreturn ar=new Addreturn();
		ar.add(10, 20);
		//ar.add(10, 54);
		//ar.add(32767, 32);
	}
}
