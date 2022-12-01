package com.kumar;

public class ArraRev {
	public static void main(String[] args)
	{
	int[] A= {1,2,3,4,5,6};
	int n=A.length;
	for(int i=A[n-2];i>=0;i--)
	{
		System.out.println(A[i]);
	}

}
}
