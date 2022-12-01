package com.vari;

public class Automp {
	static void isAutomap(int num)
	
	{
		
		int check=num*num;
		System.out.println(check);
		int rem=0;
	 int rev=0;

			
		for(int i=1;i<=2;i++)
			
		{
			rem=check%10;
			rev=(rev*10)+rem;
			check=check/10;
			
		}
		int rem1=0;
		int rev1=0;
		for(int i=1;i<=2;i++)
		{
			rem1=rev%10;
			rev1=(rev1*10)+rem1;
			rev=rev/10;
		}
		if(num==rev1)
		{
			System.out.println("given number is atumporpic");
		}
		else {
			System.out.println("non auomapic");
		}
	}
	public static void main(String[] args)
	{
		isAutomap(25);
		isAutomap(76);
		isAutomap(26);
	}

}
