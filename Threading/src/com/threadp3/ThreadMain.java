package com.threadp3;

public class ThreadMain {
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<=5;i++)
		{
			System.out.println("main thread   "+Thread.currentThread().getName());
			Thread.sleep(1000);
			
		}
	
	Thread1 t1=new Thread1();
	Thread2 t2=new Thread2();
	Thread td=new Thread(t2);
	//t1.start();
	//t1.join();
	td.start();
	td.join();
	td.wait();
	t1.start();
	
	
}
}