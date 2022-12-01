package com.abstraction;

public class Animal extends LivingThing {
	String food;
	String aplication;

	Animal(String name, int legs, int wings, String placeofliving,String aplication,String food) {
		super(name, legs, wings, placeofliving);
		this.aplication=aplication;
		this.food=food;
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