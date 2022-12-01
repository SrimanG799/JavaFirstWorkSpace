package com.innerClass;

public class Student {
	private int id;
	private String name;
	private static String COLLEGE="TPCE";
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public void display()
	{
		System.out.println("id  "+id+" name  "+name);
	}
	public class Marks
	{
		int sub1;
		int sub2;
		int sub3;
		Marks(){
			
		}
		public Marks(int sub1, int sub2, int sub3) {
			super();
			this.sub1 = sub1;
			this.sub2 = sub2;
			this.sub3 = sub3;
		}
		
		@Override
		public String toString() {
			return "Marks [sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + "]";
		}

		public double avg(double total)
		{
			display();
			double avg=total/3;
			return avg;
			
		}
		public double results()
		{
			if(sub1==0&&sub2==0&&sub3==0)
			{
				System.out.println("write exam again");
			}
			else
			{
				double total=sub1+sub2+sub3;
				System.out.println("Total marks  "+total);
				return total;
				
			}
			return 0;
		}
		
	}
	
	

}
