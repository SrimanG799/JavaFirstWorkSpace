package com.nuimbersystem;

public class Arraypolindrome
{
public static void main(String[] args)
{
	 int[] A= {151,343,745,964,939,232,471};

	
	
	
		for(int i=0;i<=A.length-1;i++)
		{
		int num=A[i];	
		
      int temp=num;
      int rem=0;
      int rev=0;
      while(num>0)
      {
    	  
      rem=num%10;
    	  rev=(rev*10)+rem;
    	  num=num/10;
      }
      System.out.print(rev +" ");
      if(rev==temp)
      {
    	  System.out.println("it is polindrome");
    	  
    	  }
      else {
    	  System.out.println("not polindrome");
      }
      }
}
}