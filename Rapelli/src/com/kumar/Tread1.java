package com.kumar;

public class Tread1 extends Thread {
	public void run()
	{
		for(int i=0;i<=45;i++)
		{
			if(i%2==0||i%3==0)
			{
			
			 continue;
				
			}
			else
			{
				System.out.println(i);
			}
		}
	}
public static void main(String[] args)
{
	Tread1 t1=new Tread1();
	Thread td=new Thread(t1);
	td.start();
	
}
	
	
}
