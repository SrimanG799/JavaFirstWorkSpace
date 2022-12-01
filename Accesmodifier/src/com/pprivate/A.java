package com.pprivate;

public class A {
	int a=20;
	int b=30;
	private int c=20;//private variable acces in only within class
	private int d=30;
	void display()
	{
		System.out.println("method in class");
	}
	private void show()//private methods acces in only same class
	{
		System.out.println(" method show from A");
	}

	}


