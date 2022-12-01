package com.threadPriority;

public class Thread2 extends Thread{
	String name2;
	public Thread2(String name2)
	{
		this.name2=name2;
	}
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
		System.out.println("Thread2");
	}
	}
}
