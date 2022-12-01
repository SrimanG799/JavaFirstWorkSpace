package com.hasaRealation;

public class AdressTest {
	public void getByName(char name)
	{
		Orgadd p1=new Orgadd("ts", "hyd", "mindspace");
		Orgadd p2=new Orgadd("ts","hyd","hitch city");
		Orgadd p3=new Orgadd("ap","amrvt","it park");
		Orgadd p4=new Orgadd("karntaka","bangulur","silicanvally");
		Adress a1=new Adress("ts", "knr", "malharrao", "pdt", "4-11",p1);
		Adress a2=new Adress("ts", "hyd", "ameerpet", "sr nagar", "1-54a",p2);
		Adress a3=new Adress("ts","wgl","kzpt","somidi","3-41",p3);
		Adress a4=new Adress("ap", "egv", "recharla", "tadipatri", "2-84",p4);
		Organization o1=new Organization("tech mahi", "sriman", 1, 65000, a1);
		Organization o2=new Organization("tech mahi", "shan", 2, 70000, a2);
		Organization o3=new Organization("tech mahi", "pooja ", 3, 650000, a3);
		Organization o4=new Organization("tech mahi", "potti", 4, 72000, a4);
		Organization[] O= {o1,o2,o3,o4};
		for(Organization N:O)
		{
			if(N.getEmpname().charAt(0)==name)
			{
				System.out.println(N.toString()); 
			}
			else
			{
				System.out.println("no details");
			}
			
		}
		
		
		
		
		
	}
	public static void main(String[] args) {
		AdressTest ad=new AdressTest();
		//ad.getByName('p');
		ad.getByName('a');
		
		
	}

}
