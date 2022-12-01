package com.array;

public class RemoveDupli {
	public static void main(String[] args) {
		int []A= {1,2,8,1,5,2,1,8,6,8,6,4,3,2,1,4,8};
		int [] temp=new int[A.length];
		temp[0]=A[0];
		for(int i=1;i<A.length;i++)
		{
			for(int j=0;j<temp.length;j++)
			{
				if(A[i]==temp[j])
				{
					
				}
				else
				{
					int m=1;
					temp[m]=A[i];
					m++;
				}
			}
		}
		for (int i : temp) {
			System.out.println(i);
			
		}
	}

}
