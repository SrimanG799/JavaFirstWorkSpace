package com.exception;

public class ExcMeth2 {
	static void div(int a,int b) throws MisinputException
	{
		try{
			if(b==0||b==5)
		{
			throw new MisinputException("b connat 0 or 5");
		}
		int res=a/b;
		System.out.println(res);
		}
		catch(MisinputException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws MisinputException
	{
		div(30, 5);
		div(48, 6);
		div(10,0);
		div(30,6);
		div(40,4);
		div(45,5);//AQ312188893IN
		div(54,0);
		div(60,4);
		
	}

}
