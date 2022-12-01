package com.trRunnable;

public class Thread1 implements Runnable{
@Override
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println("Thread runnable ");
	
			}
		}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Thread extends");
		}
	}
	

		
	
public static void main(String[] args) {
	Thread1 t1=new Thread1();
	Thread td=new Thread(t1);
	Thread2 t2=new Thread2();
	t2.start();
	td.start();
	
}

}
