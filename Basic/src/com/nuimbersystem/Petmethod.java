package com.nuimbersystem;

public class Petmethod {

	static void isPeter(int num)
	{
	int fact=1;
	int rem=0;
	int sum=0;
	int temp=num;
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
	
	
    
    
    
    
	




if(sum==temp)
{
	System.out.println(sum+" it is peterson");
}
else {
	System.out.println(sum+" it is not peterson");
	
}


}
	public static void main(String[] args)
	{
		
		isPeter(145);
		isPeter(465);
	}
}
