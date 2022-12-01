package com.vari;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args)
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("select ur type of operation");
		System.out.println(" 1 for Arithmatic");
		System.out.println("2 for trigonometric");
		int oprn=sc.nextInt();
		switch(oprn)
		{
		case 1:
		{
			System.out.println("welcome to arithmatic operations");
			System.out.println("select option type");
			System.out.println(" 1 all arithmatic values");
		
		
			System.out.println("2for intrest of money");
			System.out.println("3 values converter");
			int num=sc.nextInt();
			switch(num)
			{
			case 1:
			{
				System.out.println("enter first value");
				double a=sc.nextDouble();
				System.out.println("enter second value");
				double b=sc.nextDouble();
				System.out.println("sum of two numbers= "+(a+b));
				System.out.println("sub of two mumbers ="+(a-b));
				System.out.println("product of two numbers= "+(a*b));
				System.out.println("div of a by b="+(a/b));
				System.out.println("rem of a by b="+(a%b));
				break;
				
			}
			case 2:
			{
				System.out.println("welcome to intrest of money");
				System.out.println("select which type of intrest");
				System.out.println("1 for simple intrest ");
				System.out.println("2 for compound intrest");
				int intr=sc.nextInt();
				switch(intr)
				{
				
				
				case 1:
					
				{
					
					System.out.println("enter moneny time(in months) and intrest");
					double M=sc.nextDouble();
					int time=sc.nextInt();
					double intrest=sc.nextDouble();
					double total=(M*time*intrest/100)+M;
					System.out.println("total amount to pay for debter = "+total);
					break;
				}
				case 2:
				{
					System.out.println("enter money time(year) intrest");
					double Ma=sc.nextDouble();
					int timec=sc.nextInt();
					double intrest2=sc.nextDouble();
					double total = 0;
					for(int i=1;i<=timec;i++)
					{
					 total=Ma+(Ma*timec*intrest2/100);

					
				}
					System.out.println(total);
				}
				
				
				
			}
			
			}
			}
			break;
		}
		case 2:
			
		{
			System.out.println("welcome to trigonometry");
			break;
		}
		}
		
	}

}
