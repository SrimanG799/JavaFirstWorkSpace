package com.threadTest;

public class ThreadMain {
	public static void main(String[] args) throws InterruptedException {
		Table table1=new Table();
		Table table2=new Table();
		
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		Thread t=new Thread(t2);
		t1.start();
		//t1.join();
		t.start();
		//t.join();
	//	Thread t3=new Thread(5,table1);
	
		
	}

}
