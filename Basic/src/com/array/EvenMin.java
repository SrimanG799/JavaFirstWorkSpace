package com.array;

public class EvenMin {
	public static void main(String[] args) {
		int[] A= {15,10,22,8,16,32,78,45,65,6,12,33,3,4,2};
		int min=A[0];
		for(int i=0;i<A.length;i++)
		{
			if(min>A[i]&&A[i]%2==0)
			{
				min=A[i];
			}
		}
		System.out.println(min);
		
		
		
		
	}
	}
	