package com.abstraction;

public abstract class Athlete {
	private String name;
	private String nickName;
	private int yearofborn;
	private String team;
	private int gamesplayed;
	public Athlete(String name, String nickName, int yearofborn, String team, int gamesplayed) {
		super();
		this.name = name;
		this.nickName = nickName;
		this.yearofborn = yearofborn;
		this.team = team;
		this.gamesplayed = gamesplayed;
	}
	public void getBioData()
	{
		System.out.println(name);
		System.out.println(nickName);
		System.out.println(yearofborn);
		System.out.println(team);
		System.out.println(gamesplayed);
	}
	public abstract void getBodyType();
	public abstract void achivements();
	
	

}
