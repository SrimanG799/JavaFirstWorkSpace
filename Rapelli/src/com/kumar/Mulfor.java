package com.kumar;
import java.util.Scanner;

public class Mulfor {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to multiply");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			int M=n*i;
			System.out.println(M);
		}
	}

}
