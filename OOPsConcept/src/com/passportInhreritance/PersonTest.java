package com.passportInhreritance;

public class PersonTest {
	public static void main(String[] args)
	{
		Person person=new Person(12444,1,"sriman","kumar",26,"hyd");
		Person person2=new Person(11214,2,"phasha","shan",24,"knr");
		Person person3=new Person(0,3,"mahesh","ravi",25,"srkklm");
		
		person3.getBiodata();
		person3.applyPassport();
	}

}
