package com.abstraction;

public abstract class Athlet {
	private String name;
	private String nickName;
	private int yearofborn;
	private String team;
	private int gamesPlayed;
	public Athlet(String name,String nickName,int yearofborn,String team,int gamesplayed)
	{
		this.name=name;
		this.nickName=nickName;
		this.yearofborn=yearofborn;
		this.team=team;
		this.gamesPlayed=gamesPlayed;
	}
	public void getbioData()
	{
		System.out.println("name "+" "+nickName);
		System.out.println("year of born "+yearofborn);
		System.out.println("team  "+team);
		System.out.println(" games played  "+gamesPlayed);
	}
	public abstract String getBodytype();
	public String getName() {
		return name;
	}
	public String getNickName() {
		return nickName;
	}
	public int getYearofborn() {
		return yearofborn;
	}
	public String getTeam() {
		return team;
	}
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	
		
	
	

}
