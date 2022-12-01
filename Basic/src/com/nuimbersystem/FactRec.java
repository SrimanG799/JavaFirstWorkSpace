package com.nuimbersystem;

public class FactRec {
	int fact(int n)
	{
		if(n==1)
		{
		return 1;
		}
		else
		{
			int x=n*fact(n-1);
			return x; 
		}
		
	}
	public static void main(String[] args)
	{
		FactRec f=new FactRec();
		System.out.println(f.fact(7));
	}

}
