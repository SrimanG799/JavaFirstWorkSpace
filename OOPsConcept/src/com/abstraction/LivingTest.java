package com.abstraction;

public class LivingTest {
	public static void main(String[] args)
	{
		Animal cow=new Animal("cow", 4, 0, "on earth", "pet milk", "grass");
		Animal dog=new Animal("dog", 4, 0, "on earth", "pet security", "milk and meat");
		Animal fish=new Animal("fish",0,6,"in water","for meat","insects in water");
		Birds parrot=new Birds("parrot", 2, 2, "on trees", "grains and insects", "pet");
		Birds rooster=new Birds("rooster", 2, 2, "on earth", "grains and insects", "meat");
		LivingThing[] pet= {cow,dog,fish,parrot,rooster};
		
		
		for(LivingThing thing:pet)
		{
			thing.getDetails();
			thing.getBehavior();
			thing.getFood();
			System.out.println("------->>>>");
			
		}
		
	}

}
