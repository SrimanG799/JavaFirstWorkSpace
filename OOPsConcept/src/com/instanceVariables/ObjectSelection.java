package com.instanceVariables;

import java.util.Scanner;

public class ObjectSelection{

	int id;
	String name;
	int telugu;
	int hindhi;
	int english;
	int maths;
	int science;
	int social;


	void display()
	{
		System.out.println("id        "+id);
		System.out.println("name      "+name);
		System.out.println("telugu    "+telugu);
		System.out.println("hindhi    "+hindhi);
		System.out.println("english   "+english);
		System.out.println("maths     "+maths);
		System.out.println("science   "+science);
		System.out.println("social    "+social);
		System.out.println("total     "+(telugu+hindhi+english+maths+science+social));
		
		System.out.println("------------------------>>>>>>>");
		
	}
	public static void main(String[] args)
	{
		Students s1=new Students();
		s1.id=1;
		s1.name="sriman";
		s1.telugu=78;
		s1.hindhi=87;
		s1.english=77;
		s1.maths=97;
		s1.science=88;
		s1.social=86;
		
		
		Students s2=new Students();
		s2.id=2;
		s2.name="kumar";
		s2.telugu=76;
		s2.hindhi=85;
		s2.english=76;
		s2.maths=87;
		s2.science=68;
         s2.science=77;
		Students s3=new Students();
		s3.id=3;
		s3.name="shan";
		s3.telugu=76;
		s3.hindhi=85;
		s3.english=76;
		s3.maths=87;
		s3.science=68;
		s3.social=76;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to display object");
		int a=sc.nextInt();
		if(a==1)
		{
			s1.display();
		}
		if(a==2)
		{
		s2.display();	
		}
		if(a==3)
		{
			s3.display();
		}
			if(a>3)
			{
				System.out.println("no objects obove 3");
			}
			
		
		
	
	

}



}
