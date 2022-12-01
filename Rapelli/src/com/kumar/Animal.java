package com.kumar;

public abstract class Animal {
	abstract void sound();
	void display()
	{
		System.out.println("this is abstract");
		
	}

}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("dog is barking");
	}
	public static void main(String[] args)
	{
		Dog d=new Dog();
		d.sound();
	}

}
