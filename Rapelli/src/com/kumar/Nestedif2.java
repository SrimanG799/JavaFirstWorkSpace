
package com.kumar;

public class Nestedif2 {
	public static void main(String[] args)
	{
		int num=18;
		if(num%2==0)
		{
			System.out.println("it is even number");
			if(num>20)
			{
				System.out.println("it is greater than 20");
			}
			if(num<50)
			{
				System.out.println("it is below 50");
			}
			else
			{
				System.out.println("it is lessthan 20");
			}
			
			
		}
	}

}
