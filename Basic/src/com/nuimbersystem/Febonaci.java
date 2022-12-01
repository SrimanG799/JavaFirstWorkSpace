package com.nuimbersystem;

public class Febonaci
{
	public static void main(String [] args)
	{

	int l=0;
	int m=1;
	int k=1;
	int q;
	System.out.println(l);
	System.out.println(m);
	System.out.println(k);
for(int i=1;i<=15;i++)
{
	q=l+m+k;
	System.out.println(q);
	l=m;
	m=k;
	k=q;
}
}
	
}

