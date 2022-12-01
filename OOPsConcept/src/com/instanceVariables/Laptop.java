package com.instanceVariables;

public class Laptop {//Instance Variables
	String BrandName;
	String Model;
	String Colour;
	String Processor;
	String Ram;
	String Memory;
	int  Price;
	public void laptap()
	
	{
		System.out.println(BrandName+"\n"+Model+"\n"+Colour+"\n"+Processor+"\n"+Ram+"\n"+Memory+"\n"+Price+"rs");
		
		System.out.println(" ");
	}
	public static void main(String[] args)
	
	{
		Laptop lp1=new Laptop();
		lp1.BrandName="Dell";
		lp1.Model="inspiron 15 30000";
		lp1.Colour="block";
		lp1.Processor="i3 11th gen";
		lp1.Ram="8gb ddr4";
		lp1.Memory="512Gb ssd";
		lp1.Price=43000;
		lp1.laptap();
		Laptop lp2=new Laptop();
		lp2.BrandName="Hp";
		lp2.Model="Pavilion";
		lp2.Colour="block";
		lp2.Processor="AMD Ryzon core3";
		lp2.Ram="8gb ddr4";
		lp2.Memory="256Gb SSD+1GB HDD";
		lp2.Price=48000;
		lp2.laptap();
	}
	
	
	

}
