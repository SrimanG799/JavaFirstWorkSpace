package com.comparatorf;
import java.util.*;
public class TestComp {
	public static void main(String[] args) {
		
	
	
	ArrayList Al=new ArrayList();
	Al.add(new Student(5, "rakesh", 35000));
	Al.add(new Student(2, "kumar", 25000));
	Al.add(new Student(8,"sravn",33000));
	Al.add(new Student(1,"mahesh",24000));
	Collections.sort(Al,new NameComp());
	Iterator itr=Al.iterator();
	System.out.println("sorting by name");
	while(itr.hasNext())
	{
		Student st=(Student)itr.next();
		System.out.println(st.roll+" "+st.name+" "+st.fee);
	}
	
	
	Collections.sort(Al,new AgeComp());
	Iterator itr2=Al.iterator();
	System.out.println("sort by roll");
	{
		while(itr2.hasNext())
		{
		Student st2=(Student)itr2.next();
		System.out.println(st2.roll+" "+st2.name+" "+st2.fee);
		}
	}

}
}