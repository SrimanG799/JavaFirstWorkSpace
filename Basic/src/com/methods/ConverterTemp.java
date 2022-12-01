package com.methods;

import java.util.Scanner;

public class ConverterTemp {
	

float C;
	
	void inCentigrade(float F)
	{
		C=(F-32)*5/9;
		System.out.println("given temp in foranhit ");
		System.out.println(C);
		
	}
	public static void main(String[] args)
	{
		ConverterTemp CT=new ConverterTemp();
		CT.inCentigrade(32.1f);
		CT.inCentigrade(54.41f);
	}
		
	

}
