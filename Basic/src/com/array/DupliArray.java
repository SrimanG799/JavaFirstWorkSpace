package com.array;

public class DupliArray {
	public static void main(String[] args) {
		
	
	int[] A= {5,6,7,2,8,7,6,8,4,7,5,6,};
	int [] B=new int[A.length];
	for(int i=0;i<A.length;i++)
	{
		for(int j=i+1;j<A.length;j++)
			
		{
			
			if(A[i]!=A[j])
			{
				int k=0;
				
				B[k]=A[i];
				k++;
				continue;
				
			}
		
			
			
		}
	}
	for(int b:B)
	{
		System.out.println(b);
	}
		
	}
	

}
