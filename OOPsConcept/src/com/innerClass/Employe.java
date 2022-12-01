package com.innerClass;

public class Employe {//outer class
	private int id;
	private String name;
	public Employe(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + "]";
	}
	class Leaves
	{
		private int leaves;

		public Leaves(int leaves) {
			super();
			this.leaves = leaves;
		}

		@Override
		public String toString() {
			return "Leaves [leaves=" + leaves + "]";
		}
		
		
		
		
	}
	public static void main(String[] args)
	{
		
		Employe e1=new Employe(1,"sriman");
		
		System.out.println(e1.toString());
		Employe.Leaves l=e1.new Leaves(10);
		System.out.println(l);
		
	}
	

}
