package com.kumar;
import java.util.Scanner;

public class Ifdemo2 {
	public static void main(String[] args)
	{
		int a=45;
		int b=6;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a condition");
		int con=sc.nextInt();
		if(con==1)
		{
			System.out.println(a+b);
		}
		else if(con==2)
		{
			System.out.println(a-b);
		}
		
	}

}
