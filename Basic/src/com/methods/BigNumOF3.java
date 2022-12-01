package com.methods;

public class BigNumOF3 
{
	void bigNum(int a,int b,int c)
	{
		if(a>b&&a>c)
		{
			
			
				System.out.println(" a is bigger  value"+a);
			}
		if(b>a&&b>c)
		{
			System.out.println(" b is big value"+b);
		}
		else
		{
			System.out.println(" c is big value"+c);
		}
	}
	public static void main(String[] args)
	{
		BigNumOF3 Bg=new BigNumOF3();
		Bg.bigNum(5, 2, 7);
		Bg.bigNum(7, 9, 4);
		
		
	}

}
