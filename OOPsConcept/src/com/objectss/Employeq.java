package com.objectss;

public class Employeq {
	int id;
	String name;
	public Employeq(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		
		Employeq e=(Employeq)obj;
		if(this.getClass()!=e.getClass())
			return false;
		if(this.id==e.id&&this.name==e.name)
			return true;
	
		return false;
	}
public static void main(String[] args) {
	Employeq e1=new Employeq(1, "sriman");
	Employeq e2=new Employeq(1, "sriman");
	Employeq e3=new Employeq(1, "shan");
	Employeq e4=e2;
	//Employeq e5=new Employeq();
	//Mobile m=new Mobile("gfgfg", "451", "c25", f1);
	System.out.println(e1.equals(e2));
	System.out.println(e1.equals(e3));
	System.out.println(e4.equals(e2));
	System.out.println(e4.equals(e4));
	
}		
		
	
	

}
