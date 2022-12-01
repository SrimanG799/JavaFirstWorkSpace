package com.innerclasess;

public class Outer {
	private int id;
	private static String Message="welcome";
	public void printMessage()
	{
		System.out.println(" Outer id   " +id);
		System.out.println("Outer message    "+Message);
	}
	class Inner
	{
		private int id;
		//private static String msg;
		private String msg;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		
	}

}
