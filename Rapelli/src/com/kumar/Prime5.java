package com.kumar;
import java.util.Scanner;

public class Prime5 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check");
		int N=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<=N/2;i++)
		{
			if(N%i==0)
				
			{
				flag=true;
				break;
			}
		
			
	
				
			
			if(flag==false)
			{
				System.out.println("it is  prime number");
				break;
			
			}
			else
			{
				System.out.println("it  not is prime");
				break;
			}
		}
	
	}

}
