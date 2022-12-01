package com.kumar;

class ThreadDemo3 implements Runnable {
	int count;
	public synchronized  void run()
	{
		for(int i=1;i<=10000;i++)
		{
			
			count++;
		}
		//System.out.println(count);
	}
	public static void main(String[] args)
	{
		ThreadDemo3 td3=new ThreadDemo3();
		Thread t1=new Thread(td3);
		Thread t2=new Thread(td3);
		t1.start();
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		t1.setName("threaset1");
		t2.setName("threadset2");
		t1.setPriority(1);
		t2.setPriority(10);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		try
		{
			t1.join();
			t2.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	
	System.out.println(td3.count);
	System.out.println(t1.isAlive());
	System.out.println(t1.isAlive());

}
}