package com.instanceVariables;

public class ChainCons {
	ChainCons()//cunstructor1
	{
		this(5);//calls constructor 2
		System.out.println("default constructor");
		
	}
	ChainCons(int x)//cunstructor 2
	{
		this(4,15);//call cunstructur 3
		System.out.println(x);
		System.out.println("2nd");
	}
	ChainCons(int a,int b)//Consstuctor3
	{
		this(7,2,9);
		System.out.println(a*b);
		System.out.println("3 rd");
	}
	ChainCons(int a,int b,int c)
	{
		System.out.println(a+b+c);
		System.out.println("final");
	}
	public static void main(String[] args)
	{
		ChainCons Ch=new ChainCons();
	}
	

}
