package com.array;

public class Stringword {
	public static void main(String[] args)
	{
		String s="rapelli sriman kumar ";
		String[] R=s.split(" ");
		System.out.println(s);
		System.out.println(R);
		for(int i=0;i<R.length;i++)
		{
			System.out.print(R[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
		for(int i=R.length-1;i>=0;i--)
		{
			System.out.print(R[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
		for(int i=0;i<R.length;i++)
		{
		
			
				char [] ch=R[i].toCharArray();
				for(int j=ch.length-1;j>=0;j--)
				{
					System.out.print(ch[j]);
					
				}
				System.out.print(" ");
			
			
	}

	}}
