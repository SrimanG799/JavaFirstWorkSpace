package com.employSetGet;

public class Employe2
{
	
	
	public void getAll()
	{
		
	
	
	
	
		Employe1 emp1=new Employe1(1,"sriman","jr developer",5,50000);
		Employe1 emp2=new Employe1(2,"kumar","Meneger",3,60000);
		Employe1 emp3=new Employe1(3,"shan","HR",4,80000);
		Employe1 emp4=new Employe1(4,"mahesh","sr developer",3,75000);
		Employe1 emp[]= {emp1,emp2,emp3,emp4};
		for(Employe1 e:emp)
		{
			e.display();
		}
	}
	public void getById(int id)
	{

		Employe1 emp1=new Employe1(1,"sriman","jr developer",5,50000);
		Employe1 emp2=new Employe1(2,"kumar","Meneger",3,60000);
		Employe1 emp3=new Employe1(3,"shan","HR",4,80000);
		Employe1 emp4=new Employe1(4,"mahesh","sr developer",3,75000);
		Employe1 emp[]= {emp1,emp2,emp3,emp4};
		int result=0;
		for(Employe1 e:emp)
		{
			if(e.getId()==id)
			{
				System.out.println("get by id  "+id);
			
			e.display();
			System.out.println("-------->>>>>");
			result=1;
			break;
		}
			else if(result==0)

			{
				System.out.println(" enter valid id");
				break;
			}
	}
	
}
	public void getByname(String name)
	{

		Employe1 emp1=new Employe1(1,"sriman","jr developer",5,50000);
		Employe1 emp2=new Employe1(2,"kumar","Meneger",3,60000);
		Employe1 emp3=new Employe1(3,"shan","HR",4,80000);
		Employe1 emp4=new Employe1(4,"mahesh","sr developer",3,75000);
		Employe1 emp[]= {emp1,emp2,emp3,emp4};
		int result=0;
		for(Employe1 e:emp)
		{
			if(e.getName()==name)
			{
				System.out.println("get by Name   "+name);
			
			e.display();
			System.out.println("-------->>>>");
			result=1;
			break;
		
	}
			else if(result==0)
			{
				System.out.println("enter valid name");
				break;
			}
	
	
	
	
	
}
	}
	public static void main(String[] args)
	{
		Employe2 e2=new Employe2();
		e2.getAll();
		e2.getById(1);
		e2.getByname("mahesh");
		e2.getById(10);
		
	}
}
