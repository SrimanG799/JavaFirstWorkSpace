package com.array;

public class Searchelement {
	public static void main(String[] args)
	{
		boolean flag=false;
		int[] Array= {4,8,7,2,1,3,5,6,9};
		int element=9;
		//int index=0;
		int n=0;
		for(int i=0;i<Array.length;i++)
		{
			if(Array[i]==element)
			{
				flag=true;
				//index=i;
				n=i;
				
			}
			
		}
		if(flag==true)
		{
			System.out.println("element " +element +" is presented in"+n+ "th index of  Array");
		}
		else
		{
			System.out.println("elemenr is not in Array");
		}
	}

}
