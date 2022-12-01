package com.array;

public class Arraysort1 {
	public static void main(String[] args)
	
	{
		int[] A= {3,25,10,87,4,2,1,99 };
		int temp=0;
		for(int i=0;i<A.length;i++)
		{
			for(int j=i+1;j<A.length;j++)
			{
				if(A[i]>A[j])
				{
					temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
		for(int k=0;k<A.length;k++)
		{
			System.out.print(A[k] +" ");
		}
		
	}

}
