package com.kumar;

public class Sortarr {
	public static void main(String[] args)
	{
	int[] A= {9,5,7,3,5,2,4,1,6};
	int max=A[0];
	for(int i=0;i<A.length;i++)
	{
	
		for(int j=i+1;j<A.length;j++) {
			if(A[i]>A[j]) 
			{
				max=A[i];
			
			}
			else {
				max=A[j];
			}
			
			
		}
	}
	 System.out.println(max);
	}
			
	

 
}
