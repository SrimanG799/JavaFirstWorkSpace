package com.employSetGet;

public class StudentGet extends LibGet{
	String name;
	int  id;
	String book;
	int holdingdays;
	int due;
	static int fine=2;//penality per day 2rupees
	static String lib=librarian;
	static String libr=Library;
	public StudentGet(String name,int id,String book,int holdingdays)
	{
		this.name=name;
		this.id=id;
		this.book=book;
		this.holdingdays =holdingdays;
	}
	public void fineDetails()
	{
		System.out.println("___library details------");
		System.out.println("Librarian      "+lib);
		System.out.println("Library         "+libr);
		System.out.println("StudentName     "+name);
		System.out.println("StudentId        "+id);
		System.out.println("BookName         "+book);
		System.out.println("HoldingDays        "+holdingdays);
		if(holdingdays>15)
		{
			int days=holdingdays-15;
			due=days*fine;
			System.out.println("Penality        "+due);
			
		}
		else
		{
			System.out.println("penality         "+"nodue");
		}
		System.out.println("------------------------------");
	}
	int getId()
	{
		return this.id;
	}
	String getName()
	{
		return this.name;
		
	}

}
