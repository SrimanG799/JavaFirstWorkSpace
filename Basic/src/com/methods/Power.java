package com.methods;

public class Power {
	public void powerOf(int a,int b)
	{
		int result=1;
		for(int i=1;i<=b;i++)
		{
		result=result*a;	
		}
		System.out.println(result);
	}
	public static void main(String[] args)
	{
		Power po=new Power();
		po.powerOf(2,2);
		po.powerOf(3,2);
		po.powerOf(4, 4);
		po.powerOf(5, 3);
		po.powerOf(2, 3);
	}

}
