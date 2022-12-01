package com.nuimbersystem;

public class Peterson {
public static void main(String[] args)
{
	int num=145;
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
	System.out.println(sum);
	
    
    
    
    
	




if(sum==temp)
{
	System.out.println("it is peterson");
}
else {
	System.out.println("not peterson");
	
}
}
}

