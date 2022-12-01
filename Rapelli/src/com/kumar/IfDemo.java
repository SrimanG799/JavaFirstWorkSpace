package com.kumar;
import java.util.Scanner;
public class IfDemo 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age to check");
	int age=sc.nextInt();
	if(age<18)
	{
		System.out.println("not eligible to vote");
		
	}
	else
	{
		System.out.println("eliogible to vote");
	}
	}
}
	
	
