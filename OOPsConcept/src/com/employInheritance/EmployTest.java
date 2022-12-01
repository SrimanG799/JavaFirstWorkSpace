package com.employInheritance;

public class EmployTest {
	public static void main(String[] args)
	{
		Employe e1=new Employe(1,"sriman", "kumar", "java developer", 26, 65000);
		Employe e2=new Employe(2,"shan","phasha","java developer",24,78000);
		Employe e3=new Employe(3,"kumar","ponnam",".net developer",25,78500);
		
		
		e1.getDetails();
		e2.getDetails();
		e3.getDetails();
		System.out.println(e1);
	
	}

}
