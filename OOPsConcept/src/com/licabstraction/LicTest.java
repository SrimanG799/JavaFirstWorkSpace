package com.licabstraction;

public class LicTest {

		void getFromCity(String city)
		{
			
		
		{
		Employ e1=new Employ(1,"sriman", "ts", "hyd", 50000, "maneger");
		Employ e2=new Employ(2, "shan", "ts", "hyd", 450000, "maneger");
		Employ e3=new Employ(3,"kalyan","ts","knr",60000,"maneger");
		Employ e4=new Employ(4,"karthik","ts","knr",54000,"maneger");
		Employ e5=new Employ(5,"kumar","mp","Bhopal",45000,"maneger");
		Employ e6=new Employ(6,"nikil","ap","vijayavada",65000,"maneger");
		Employ e7=new Employ(7,"nithin","ap","guntur",54000,"maneger");
		//Employ[] e= {e1,e2,e3,e4,e5,e6,e7};
		
		
	
		
		Employ[] e= {e1,e2,e3,e4,e5,e6,e7};	
		
		for(Employ emp:e)
		{
			if(emp.getCity()==city)
			{
				
			
			emp.getDetails();
		
	
	//System.out.println(emp.getState());
	
	
			}}}
		}
		
		
		public static void main(String[] args)
		{
			LicTest l=new LicTest();
			l.getFromCity("hyd");
			l.getFromCity("knr");
			l.getFromCity("guntur");
		}
}
	

		
		
		

		
