package com.kumar;
import java.util.ArrayList;

public class Numrev 
	{
public static void main(String[] args)
{
ArrayList pol=new ArrayList();

	int x=455;
	int orig=x;
	int rem=0;
	int rev=0;
	while(x!=0)
	{
	rem=x%10;
	rev=(rev*10)+rem;
	x=x/10;

	
	}
	System.out.println(rev);

	if(rev==orig)
	{
		pol.add(orig);
		System.out.println("it is polindrome");
	}
	else if(rev!=orig)
	{
		System.out.println("it is not polindrme");
	}
}
}
