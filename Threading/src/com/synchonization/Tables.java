package com.synchonization;

public class Tables {
	public static synchronized void printTable(int num) throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+(num*i));
			Thread.sleep(1000);
		}
	}
	

}
