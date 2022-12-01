package com.instanceVariables;

public class Laptop2 {
	String BrandName;
	String Model;
	String Colour;
	String Processor;
	String Ram;
	String Memory;
	int  Price;
	public void laptap()
	
	{
		System.out.println("BrandName  "+BrandName);
		System.out.println("Model      "+Model);
		System.out.println("Colour     "+Colour);
		System.out.println("Processor  "+Processor);
		System.out.println("Ram        "+Ram);
		System.out.println("Memory     "+Memory);
		
		System.out.println("Price      "+Price);
		
		
		System.out.println("--------------------------------------->>");
	}
	public static void main(String[] args)
	
	{
		Laptop2 lp1=new Laptop2();
		lp1.BrandName="Dell";
		lp1.Model="inspiron 15 30000";
		lp1.Colour="block";
		lp1.Processor="i3 11th gen";
		lp1.Ram="8Gb ddr4";
		lp1.Memory="512Gb SSD";
		lp1.Price=43000;
		lp1.laptap();
		Laptop2 lp2=new Laptop2();
		lp2.BrandName="Hp";
		lp2.Model="Pavilion";
		lp2.Colour="block";
		lp2.Processor="AMD Ryzon core3";
		lp2.Ram="8GB ddr4";
		lp2.Memory="256GB SSD+1GB HDD";
		lp2.Price=48000;
		lp2.laptap();
	}
	
	
	

}



