package com.abstraction;

import java.util.Random;

public class BasketBall extends Athlet {
	
		// TODO Auto-generated constructor stub
	
	private double numoffreethrowspercentage;
	private int numofpointErned;
	public BasketBall(String name, String nickName, int yearofborn, String team, int gamesplayed,double percentage,int numofpointErned) {
		super(name, nickName, yearofborn, team, gamesplayed);
		this.numoffreethrowspercentage=percentage;
		this.numofpointErned=numofpointErned;
	}
	public void freeThrow()
	{Random random=new Random();
	if(random.nextDouble()*100>50)
	{
		System.out.println(" percentage is less than expected results");
	}
	else {
		
		System.out.println(numoffreethrowspercentage);
	}
		
	}
	@Override
	public String getBodytype() {
	// TODO Auto-generated method stub
	return "Toll and muscle type";
	}
	@Override
	public void getbioData() {
	// TODO Auto-generated method stub
	super.getbioData();
	freeThrow();
	}
	public void setNumofPointsErned()
	{
	this.numofpointErned+=numofpointErned;
	
		
	}
	public int getNoofpointsErned()
	{
		return numofpointErned;
	}
		



}