package com.basicThread;

public class Stream {
	public void stream() throws InterruptedException
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(" streaming");
			Thread.sleep(1000);
		}
	}
	

	public void plaay() throws InterruptedException
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("playing");
			Thread.sleep(500);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Stream st=new Stream();
		st.stream();
		st.plaay();
		
	}
}
