package com.abstraction;

public class Birds extends LivingThing{
	
	String food;
	String aplication;

	public Birds(String name, int legs, int wings, String placeofliving,String food,String aplication) {
		super(name, legs, wings, placeofliving);
		// TODO Auto-generated constructor stub
		
		this.food=food;
		this.aplication=aplication;
	}

	@Override
	public void getFood() {
		// TODO Auto-generated method stub
		System.out.println(food);
		
		
	}

	@Override
	public void getBehavior() {
		// TODO Auto-generated method stub
		System.out.println(aplication);
		
	}
	

}
