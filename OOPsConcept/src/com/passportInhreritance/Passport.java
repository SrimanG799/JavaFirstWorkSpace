package com.passportInhreritance;

public class Passport {
	public static String COUNTRY="ind";
	private int pasportid;
	public Passport(int pasportid)
	{
		this.pasportid=pasportid;
	
	
	}
	 public void applyPassport()
	{
		if(pasportid==0)
		{
			System.out.println("person doesnt have passport");
		}
		else
		{
			System.out.println("passportidn "+pasportid+ "countrycode "+COUNTRY);
		}
	}
	 int getPasportid()
	 {
		 return this.pasportid;
	 }

}
