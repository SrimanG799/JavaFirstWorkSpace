package com.pprivate;

public class B extends A{
	public static void main(String[] args)
	{
		B b=new B();
		System.out.println(b.a);
		System.out.println(b.b);
		b.display();
		//b.show();
		A a=new A();
		//a.show();//show is not acces by Other clasess and objects
	}
	

}
