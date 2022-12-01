package com.array;

public class Arraysort2 {
	public static void main(String[] args)
	{
		char[] CH= {'e','a','z','b','h','l','e'};
		char temp;
		for(int i=0;i<CH.length;i++)
		{
			for(int j=i+1;j<CH.length;j++)
			{
				if(CH[i]>CH[j])
				{
					temp=CH[i];
					CH[i]=CH[j];
					CH[j]=temp;
				}
			}
		}
		for(int i=0;i<CH.length;i++)
		{
			System.out.println(CH[i]);
		}
	}

}
