package com.patterns;

public class StarPatt {
	public static void main(String[] args)
	{
		int i;
		int j;
		for(  i=0;i<=7;i++)
		{
			for( j=0;j<=i;j++)
			{
				System.out.print("* ");
	
					
				
			}
			
			
				
			
		
			System.out.println(" ");
			
		}
		for(i=7;i>=0;i--)
		{
			for(j=3;j>=0;j--)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}


