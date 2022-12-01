 package com.instanceVariables;

public class Cunstructor {
	
	int id;
	String name;
	float fee;
	String course;
	String institute;
	public  Cunstructor()//Deafult cunstractor
	{
		//System.out.println(name);
		//System.out.println(id);
		//System.out.println(fee);
	
		
		
		
	}
	
	
	
	public static void main(String[] args)
	{
		
		Cunstructor cn1=new Cunstructor();
		cn1.name="sriman";
		cn1.id=1;
		cn1.course="java";
		cn1.fee=10000.00f;
		cn1.institute="create iq";
		System.out.println(cn1.name);
		System.out.println(cn1.id);
		System.out.println(cn1.fee);
		System.out.println(cn1.institute);
		System.out.println("----------->>>>>>>>>>");
		Cunstructor cn2=new Cunstructor();
		cn2.name="kumar";
		cn2.id=2;
		cn2.course="python";
		cn2.fee=12000.00f;
		cn2.institute="create iq";
		System.out.println(cn2.name);
		System.out.println(cn2.id);
		System.out.println(cn2.fee);
		System.out.println(cn2.institute);
		System.out.println("----------->>>>>");
		Cunstructor cn3=new Cunstructor();
		cn3.name="shan";
		cn3.id=3;
		cn3.course="full stack developer";
		cn3.institute="create iq";
		cn3.fee=12000;
		System.out.println(cn3.name);
		System.out.println(cn3.id);
		System.out.println(cn3.course);
		System.out.println(cn3.institute);
		System.out.println(cn3.fee);
		System.out.println("----------------->>>>");
		
		
		
	}

}
