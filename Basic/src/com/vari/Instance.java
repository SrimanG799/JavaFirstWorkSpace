package com.vari;

public class Instance {
	int a=20;
	String s="instance variable";
	void veriable() {
		int b=25;
		String c="it is local vari ble";
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		Instance in=new Instance();
		//System.out.println(in.a);
		//System.out.println(in.s);
		in.veriable();
	
	}
}
