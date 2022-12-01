package com.nuimbersystem;

public class CharOrNum {
	public static void main(String[] args)
	{
		char A='a';
		if((A>='a')&&(A<='z')||(A>='A')&&(A<='Z'))
		{
			System.out.println("it is vovel");
			
		}
		if((A>='0')&&(A<='9'))
		{
          System.out.println("it is digit");			
		
		}
		else
		{
			System.out.println("it is special char");
		}
	}

}
