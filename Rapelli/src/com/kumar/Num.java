package com.kumar;
import java.util.Scanner;
public class Num 
{
	public static void main(String[] args)
	{
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to fact");
		int n=sc.nextInt();
	
		while(n>0)
		{
			fact=fact*n;
			n=n-1;
		}
		
		System.out.println(fact);
}

}
