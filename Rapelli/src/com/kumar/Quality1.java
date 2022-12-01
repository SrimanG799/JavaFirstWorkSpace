package com.kumar;

public class Quality1 {
	public static void main(String[] args)
	{
	int[] A= {5,25,63,7,78,6,12,17};
	int ch=0;
	int adu=0;
			for(int i=0;i<A.length;i++)
			{
				if(A[i]<18)
				{
					ch++;
				}
				else if(A[i]>=18)
				{
					adu++;
				}
			}
			System.out.println("number of childrens" + ch);
			System.out.println("number of adults" +adu);
			

}
}