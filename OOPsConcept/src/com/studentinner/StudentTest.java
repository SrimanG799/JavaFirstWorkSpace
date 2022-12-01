package com.studentinner;
import com.innerClass.Student;
import com.innerClass.Student.Marks;;

public class StudentTest {
	public static void main(String[] args)
	{
		Student s1=new Student(1, "sriman");
		Student s2=new  Student(2,"kumar");
		System.out.println(s1.getName());
		s1.setName("Mahesh");
		System.out.println(s1.getName());
		Student.Marks m1=s1.new Marks(60, 70, 80);
		
		System.out.println(m1.toString());
		System.out.println(m1.results());
        Student.Marks m2=s2.new Marks(95,45,68);
        System.out.println(m2.toString());
        s2.display();
		
		
		
		
	
	

	
	
}
}
