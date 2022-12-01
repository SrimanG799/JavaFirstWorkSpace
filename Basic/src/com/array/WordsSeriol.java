package com.array;

public class WordsSeriol {
	public static void main(String[] args)
	{
		
	
	String [] A= {"zebra","yellow","zero","apple","util","pillow","fish","goat"};
	String temp;
for(int i=0;i<A.length;i++)
{
	for(int j=i+1;j<A.length;j++)
	{
		if(A[i].compareTo(A[j])>0)
			
		{
			temp=A[i];
			A[i]=A[j];
			A[j]=temp;
		}
	}
}
		for(int i=0;i<A.length;i++)
		{
			
		
		System.out.println(A[i]);
			
		}
	}
}
	

