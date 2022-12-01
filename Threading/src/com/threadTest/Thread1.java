package com.threadTest;

public class Thread1 extends Thread{
	public void run()
	{
		for(int i=0;i<=6;i++)
		{
			System.out.println("Thread1    "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
