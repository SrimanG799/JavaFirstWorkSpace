package com.methods;

public class firstMethod {
	String printName(String s1 ,String s2)
	{
		return s1+s2;
		
		
		
	}
	public static void main(String[] args)
	{
		firstMethod fn=new firstMethod();
		System.out.println(fn.printName("sriman ","rapelli"));
		System.out.println(fn.printName("create ", "iq technolgies"));
		System.out.println(fn.printName("java", "programmer"));
	}

}
