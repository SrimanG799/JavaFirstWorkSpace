package com.nuimbersystem;

public class Neon {
	public static void main(String[] args)
	{
int num=9;
int temp=num;
int rem=0;
int squre=num*num;
int sum=0;
while(num>0)
{
	rem=num%10;
	sum=sum+rem;
	num=num/10;
	
	
}
System.out.println(sum);
if(sum==temp)
{
	System.out.println("it is neo number  " +temp);
}
}
}