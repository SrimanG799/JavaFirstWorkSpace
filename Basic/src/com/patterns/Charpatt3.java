package com.patterns;

public class Charpatt3 {
	public static void main(String[] args)
	{
		int n=6;
		char ch='a';
		char temp=ch;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch);
				ch++;
				
			}
			System.out.println(" ");
			ch=temp;
			
		}
		
	}

}



