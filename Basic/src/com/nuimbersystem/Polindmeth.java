package com.nuimbersystem;

public class Polindmeth {
	static void isPolind(int num)
	{
      int temp=num;
      int rem=0;
      int rev=0;
      while(num>0)
      {
    	  
      rem=num%10;
    	  rev=(rev*10)+rem;
    	  num=num/10;
      }
      
      if(rev==temp)
      {
    	  System.out.println(rev+" is polindrome");
    	  
    	  }
      else {
    	  System.out.println( rev+" not polindrome");
      }
      }
	public static void main(String[] args)
	{
		isPolind(151);
		isPolind(353);
		isPolind(489);
	}
}
