package com.kumar;
import java.util.ArrayList;

public class Arraynun2 {
	public static void main(String[] args)
	{
ArrayList pol=new ArrayList();
		int[] A= {121,451,896,123,525,846,787};
		
		for(int i=0;i<=A.length-1;i++)
		{
			int rev=0;
			int rem=0;
			int org=A[i];
			int check=org;
		
			while(org!=0)
			{
				rem=org%10;
				rev=(rev*10)+rem;
				org=org/10;
			}
			//System.out.println(rev);
			if(rev==check)
			{
				pol.add(check);
				//System.out.println(A[i]+ "is poliondrome");
			}
			else {
				//System.out.println(A[i]+ "not polindrome");
			}
			
		}
		System.out.println("these are pol number" +pol);
	
	}

}
