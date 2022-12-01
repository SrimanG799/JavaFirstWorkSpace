package com.synchonization;

public class Thread1 extends Thread{
	int num;
	Tables table;
	/**
	 * @param num
	 * @param table
	 */
	public Thread1(int num, Tables table) {
		this.num = num;
		this.table = table;
	}
	public void run()
	{
		try {
			table.printTable(num);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	

}
