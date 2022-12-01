package com.refactor;

public class Thread1 extends Thread{
	public void run()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		t1.start();
		
		try
		{
			t1.stop();
		}
		catch(IllegalThreadStateException e)
		{
			e.printStackTrace();
		}
		t1.start();
	}

}
