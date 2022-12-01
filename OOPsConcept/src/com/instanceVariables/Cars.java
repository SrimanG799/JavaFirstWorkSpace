package com.instanceVariables;

public class Cars {
	String Brand;
	String Model;
	String Colour;
	int Seating;
	int  Milage;
	int Price;
	void display()
	{
		System.out.println("Brand    "+Brand);
		System.out.println("Model    "+Model);
		System.out.println("Colour   "+Colour);
		System.out.println("Seating  "+Seating);
		System.out.println("Milage   "+Milage+"kmpl");
		System.out.println("Price    "+Price+" Rs");
		System.out.println(" ------------------------>>>>>>");
		
		
		
		
		
	}
	public static void main(String[] args)
	{
		Cars car1=new Cars();
		car1.Brand="Suzuki";
		car1.Model="Dezire vxi petrol";
		car1.Colour="white";
		car1.Seating=5;
		car1.Milage=22;
		car1.Price=900000;
		car1.display();
		Cars car2=new Cars();
		car2.Brand="Hundai";
		car2.Model="Creta";
		car2.Colour="white";
		car2.Seating=8;
		car2.Milage=20;
		car2.Price=1800000;
		car2.display();
		
	}

}
