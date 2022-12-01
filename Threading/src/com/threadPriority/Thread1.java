package com.threadPriority;

public class Thread1 extends Thread{
	String name;
	public Thread1(String name1)
	{
		this.name=name1;
	}
	
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Thread1");
		}
	}

	
	}
	


