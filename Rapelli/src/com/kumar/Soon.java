package com.kumar;

abstract class Soon {
	abstract void sound();
	void display()
	{
		System.out.println("this is abstract");
		
	}
	void hello()
	{
		
		System.out.println("noe it is visible");
}
}

 class Cat extends Soon
{
	void sound()
	{
		System.out.println("cat is mawing");
	}
	void hai(){
		System.out.println("hello evry one");
	}

	public static void main(String[] args)
	{
		Cat d=new Cat();
		d.sound();
		d.hai();
		Soon s=new Cat();
		s.display();
		s.hello();
	}
}



		// TODO Auto-generated method stub

