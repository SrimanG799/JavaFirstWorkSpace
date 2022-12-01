package com.abstraction;

public abstract class LivingThing {
	String name;
	int legs;
	int wings;
	String placeofliving;
	
	
	public LivingThing(String name, int legs, int wings, String placeofliving) {
		super();
		this.name = name;
		this.legs = legs;
		this.wings = wings;
		this.placeofliving = placeofliving;

		
	}
public void getDetails()
{
	System.out.println(" name      "+name);
	System.out.println(" wings      "+wings);
	System.out.println(" legs        "+legs);
}
public abstract void getFood();
public abstract void getBehavior();


}
