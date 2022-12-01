package com.basicThread;

public class Thread1 extends Thread {
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("streaming");
		}
	}
	public class Thread2 extends Thread//we can create only one thread class with extends keyword
	{
		public void run()
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println("playing");
			}
		}
	}
	public static void main(String[] args) {
		
		Thread1 t1=new Thread1();
		t1.start();
		//Thread2 t2=(Thread2) new Thread();
		//t2.start();
		
	}
}
