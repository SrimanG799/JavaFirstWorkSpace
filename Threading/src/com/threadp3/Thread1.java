package com.threadp3;

public class Thread1 extends Thread {
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("thread is running"+i+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
