package com.abstraction;

public class Rectangular extends Shape{
	
	public Rectangular(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
		double area=x*y;
		System.out.println(area);
	}

}
