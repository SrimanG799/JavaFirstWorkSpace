package com.abstraction;

public class ShapeTest {
	public static void main(String[] args)
	{
		Rectangular rectangle=new Rectangular(60,30);
		Rectangular r2=new Rectangular(5,6);
		rectangle.getDetails();
		rectangle.area();
		r2.area();
		Triangle t1=new Triangle(5,3);
		t1.getDetails();
		t1.area();
		Circle c1=new Circle(5);
		c1.area();
		
	}

}
