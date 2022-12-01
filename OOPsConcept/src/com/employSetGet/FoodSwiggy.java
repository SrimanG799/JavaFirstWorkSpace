package com.employSetGet;

public class FoodSwiggy {
	void getAll()
	{
		FoodOrder fo1=new FoodOrder(1,"sriman", "Dosa", "Amaravathi", 2, 120);
		FoodOrder fo2=new FoodOrder(2,"shan","idli","Amaravathi",3,120);
		FoodOrder fo3=new FoodOrder(3,"kumar","vada","Amaravathi",2,160);
		FoodOrder fo4=new FoodOrder(4,"mahesh","Dosa","Krithinga",4,240);
		FoodOrder fo5=new FoodOrder(5,"Ravi","idli","Kalpana",4,160);
		FoodOrder fo6=new FoodOrder(6,"sriman","Dosa","Amaravathi",2,120);
		FoodOrder[] FO= {fo1,fo2,fo3,fo4,fo5,fo6};
		
		
		for(FoodOrder F:FO)
		{
			F.display();
		}
		
		
	}
	void getById(int id)
	{
		FoodOrder fo1=new FoodOrder(1,"sriman", "Dosa", "Amaravathi", 2, 120);
		FoodOrder fo2=new FoodOrder(2,"shan","idli","Amaravathi",3,120);
		FoodOrder fo3=new FoodOrder(3,"kumar","vada","Amaravathi",2,160);
		FoodOrder fo4=new FoodOrder(4,"mahesh","Dosa","Krithinga",4,240);
		FoodOrder fo5=new FoodOrder(5,"Ravi","idli","Kalpana",4,160);
		FoodOrder fo6=new FoodOrder(6,"sriman","Dosa","Amaravathi",2,120);
		FoodOrder[] FO= {fo1,fo2,fo3,fo4,fo5,fo6};
		
		
		for(FoodOrder F:FO)
		{
		if(F.getId()==id)
		{
			F.display();
		}
		}
	}
	
	void getByName(String  name)
	{
		FoodOrder fo1=new FoodOrder(1,"sriman", "Dosa", "Amaravathi",60,2);
		FoodOrder fo2=new FoodOrder(2,"shan","idli","Amaravathi",40,3);
		FoodOrder fo3=new FoodOrder(3,"kumar","vada","Amaravathi",45,4);
		FoodOrder fo4=new FoodOrder(4,"mahesh","Dosa","Krithinga",60,3);
		FoodOrder fo5=new FoodOrder(5,"Ravi","idli","Kalpana",35,6);
		FoodOrder fo6=new FoodOrder(6,"sriman","Pizza","Dominos",180,3);
		FoodOrder[] FO= {fo1,fo2,fo3,fo4,fo5,fo6};
		
		
		for(FoodOrder F:FO)
		{
		if(F.getName()==name)
		{
			F.display();
		}
		}
	}
	public static void main(String[] args)
	{
		
		FoodSwiggy Fs=new FoodSwiggy();
		Fs.getAll();
		Fs.getById(1);
		Fs.getByName("sriman");
		Fs.getByName("Shan");
		
		
		
		
		
	}
	
	
	
	
	
	
	


}