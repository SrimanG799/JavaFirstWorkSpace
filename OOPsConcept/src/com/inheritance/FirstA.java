package com.inheritance;

public class FirstA {
	int a=10;
	int b=20;
	int d=55;
	int e=65;
	public void add()
	{
		System.out.println("addition "+(a+b));
	}
	public void sub()
	{
		System.out.println("substraction "+(a-b));
	}
	public static void main(String[] args)
	{
		FirstA fa=new FirstA();
		System.out.println(fa.a);
		System.out.println(fa.b);
		fa.add();
	
	}

}
