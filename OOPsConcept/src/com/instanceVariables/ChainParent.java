package com.instanceVariables;

public class ChainParent {
	ChainParent()
	{
		System.out.println(" parent class");
	}
	ChainParent(int a,int b)
	{
		this();
		System.out.println("it is invokes first constr");
	}

	 static class Child extends ChainParent
	{
		
		Child()
		{
			super(4,5);
			System.out.println("super search for cons in parent with matched parameter");
		}
	
	public static void main(String[] args)
	{
		Child ch=new Child();
	}

}
}