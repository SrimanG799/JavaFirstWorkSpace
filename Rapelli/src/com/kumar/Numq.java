package com.kumar;
import java.util.ArrayList;
//import java.util.ArrayaList;

public class Numq {
	public static void main(String[] args)
	{
ArrayList arm=new ArrayList();
		int[] A= {370,451,153,123,371,846,787,658,142,896,245,632,784,145,230,897,963,741,456,123,789,753,951,751,953,124,653,256};
		
		for(int i=0;i<=A.length-1;i++)
		{
			int sum=0;
			int rem=0;
			int org=A[i];
			int check=org;
		
			while(org!=0)
			{
				rem=org%10;
				sum=sum+(rem*rem*rem);
				org=org/10;
			}
			//System.out.println(sum);
			if(sum==check)
			
			{
				arm.add(check);
				
				//System.out.println(A[i]+ "is armstrong");
			}
			else {
				//System.out.println(A[i]+ "not arm strong");
			}
		}
			System.out.println("arm strong numbers "+ arm);
		}}
