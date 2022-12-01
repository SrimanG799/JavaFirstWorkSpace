package com.inheritance;

public class FirstB extends FirstA {
	int a=50;
	int b=100;
	int c=42;
	public void add()
	{
		System.out.println("sum "+(a+b));
	}
	public static void main(String[] args)
	{
		FirstA fa1=new FirstA();
		fa1.add();
		FirstB fb1=new FirstB();
		fb1.add();
		System.out.println(fb1.d);//d is inherited from class A
		System.out.println(fb1.e);//e is inherited by class A
		fa1.sub();
		System.out.println(fa1.a+fb1.a);
		
	}

}
