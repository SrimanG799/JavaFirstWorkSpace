package com.typecasting;

public class cast1 {
	public static void main(String[] args)
	{
	int num=234;
	int temp=num;
	int fact=1;
	int sum = 0,rem=0;
	while(num>0)
	{
		rem=num%10;
		for(int i=1;i<=rem;i++)
		{
			fact=fact*i;
		}
		sum=sum+fact;
		num=num/10;
		fact=1;
	}
	System.out.println(sum);

	}

}
