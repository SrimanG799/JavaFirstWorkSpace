package com.vari;
import java.util.Scanner;
public class Leap {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year to check");
		int year=sc.nextInt();
		if((year%400==0)||(year%4==0&&year%100!=0))
		
		{
			System.out.println("it is leap year");
		}
		else
		{
			System.out.println("it is not leap year");
		}
	}
	

}
