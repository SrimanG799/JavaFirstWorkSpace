package com.geometry;

public class Circmethod 
{
	static void circle(double rad)
	{
		System.out.println("Area = " +((3.14)*rad*rad));
		System.out.println("peri= " +(2*(3.14)*rad));
		System.out.println("    ");
	}
	public static void main(String[] args)
	{
		circle(5);
		circle(7);
		circle(5.5);
		circle(11.56);
	}

}
