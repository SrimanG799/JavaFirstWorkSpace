package com.overload;

public class Addition {
	byte add(byte a,byte b)
	{
	
	return (byte) (a+b);
	}

	byte add(byte a,byte b,byte c)
	{
		
			
		
		return  (byte) (a+b+c);

	}
	short add(short a,short b)
	{
	
		
			return (short) (a+b);
	
	}
	short add(short a,short b,short c)
	{
		
		
			return (short) (a+b+c);
		
		}
			
		
	int add(int a,int b)
	{
		
		{
			return a+b;
			
			
		}
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	float add(float a,float b)
	{
		return a+b;
	}
	float add(float a,float b,float c)
	{
		return a+b+c;
	}
	double add(double a,double b,double c)
	{
		return a+b+c;
	}
	long add(long a,long b)
	{
		return a+b;
	}
	long add(long a,long b,long c)
	{
		return a+b+c;
	}
	
	
	public static void main(String[] args)
	{
		Addition ad=new Addition();
		System.out.println(("byte    ")+ad.add(4, 6));
		System.out.println(("short    ")+ad.add(32000,32455));
		System.out.println(("int       ")+ad.add(5454545, 78454845));
		System.out.println(("long     ")+ad.add(41414454545l, 54514545454l));
		System.out.println(("float     ")+ad.add(5.5f, 7.5f));
		System.out.println(("double   ")+ad.add(5555.444, 3554.4515, 7458.1251));
		
		
	}
	}
	


