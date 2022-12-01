package com.kumar;

public class ThreadDemo2 implements Runnable {
	String name;
	ThreadDemo2(String name1)
	{
		name=name1;
		
	};
	public void run()
	
	{
		for(int i=0;i<=10;i++)
			
		{
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			
		 System.out.println(name+" " +i); 
		}
		
		System.out.println("tread is created");
		Thread t=Thread.currentThread();
		System.out.println(t);
				
		
	}
public static void main(String[] args)
{
	ThreadDemo2 td2=new ThreadDemo2("sriman");
	ThreadDemo2 td3=new ThreadDemo2("kumar");
	ThreadDemo2 td4=new ThreadDemo2("rapelli");


	Thread t1=new Thread(td2);
	Thread t2=new Thread(td3);
	Thread t3=new Thread(td4);
	t1.start();
	try {
		t1.join();
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	t2.start();
	try
	{
		t2.join();
	}
	catch(InterruptedException e)
	{
		
		e.printStackTrace();
	}
	t3.start();
	Thread t=Thread.currentThread();
	System.out.println(t);
	for(int i=0;i<=15;i++)
	{
		System.out.println("main  "   +i);
	}
	System.out.println(td2);
	
}
	
	
	
	
	
}

