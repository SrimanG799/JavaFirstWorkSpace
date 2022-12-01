package com.abstraction;

public abstract class Shape {
	int x;
	int y;
	int ra;
	public Shape(int x,int y)
	{
		this.x=x;
		this.y=y;
		
	}
	public Shape(int r)
	{
		this.ra=r;
	}
	public abstract void area();//abstract method
	 
	public void getDetails()
	{
		System.out.println("x is  "+x +"y is "+y);
	}
	
	public static void main(String[] args)
	{
		//anonymus block
		//Shape shape=new Shape(54,4);
	}
	

}
