package com.threadPriority;

public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		Thread1 t1=new Thread1("sriman");
		Thread2 t2=new Thread2("mahesh");
		Thread3 t3=new Thread3();
		Thread4 t4=new Thread4();
		Thread5 t5=new Thread5();
		Thread td4=new Thread(t4);
		Thread td5=new Thread(t5);
		//t1.setName("sriman");
		//t2.setName("shan");
		//t3.setName("kumar");
		t1.setPriority(10);
		t2.setPriority(10);
		t3.setPriority(10);
		td4.setPriority(10);
		td5.setPriority(9);
		t1.yield();
	t1.start();
		
		t1.sleep(1000);
		
		t2.start();
	t3.start();
	t3.join();
		td4.start();
		
td5.start();
	
		
		
		
	}

}
