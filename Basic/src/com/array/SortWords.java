package com.array;

public class SortWords {
	public static void main(String[] args)
	{
		String[] Arr= {"mango","apple","banana","sapota","lemon","orange","jamun","promo","melon","avocado","mirchi"};
		int n=Arr.length;
	String temp;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(Arr[i].compareTo(Arr[j])>0)
			{
				temp=Arr[i];
	
				
				Arr[i]=Arr[j];
				Arr[j]=temp;
				
			}
		}System.out.print(Arr[i]+" ");
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(Arr[i]);
	}
	}

}
