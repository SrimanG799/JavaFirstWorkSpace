package com.employSetGet;

public class Student extends Library {
	String name;
	int  id;
	String book;
	int holdingdays;
	int due;
	static int fine=2;//penality per day 2rupees
	static String lib=librarian;
	static String libr=Library;
	public Student(String name,int id,String book,int holdingdays)
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
	public static void main(String[] args)
	{
		Student s1=new Student("sriman",1,"java",15);
		Student s2=new Student("shan",2,"java",25);
		Student s3=new Student("kumar",3,"python",30);
		Student s4=new Student("Ravi",4,"c sharp",13);
		s1.fineDetails();
		s2.fineDetails();
		s3.fineDetails();
		s4.fineDetails();
	}
	

}
