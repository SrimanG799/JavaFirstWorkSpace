package com.threadp3;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=5;i++)
		{
			System.out.println("thread2 is running"+i+Thread.currentThread().getName());
			
			try {
				Thread.sleep(2000);
				
			} catch ( IllegalMonitorStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
