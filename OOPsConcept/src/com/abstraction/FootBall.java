package com.abstraction;

public class FootBall extends Athlete {
	int goals;
	int fifa;

	public FootBall(String name, String nickName, int yearofborn, String team, int gamesplayed,int goals,int fifa) {
		super(name, nickName, yearofborn, team, gamesplayed);
		this.goals=goals;
		this.fifa=fifa;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void getBodyType() {
		// TODO Auto-generated method stub
		
		System.out.println("having tall and strong body can able to run 10km nunstop");
	}
	@Override
	public void achivements() {
		System.out.println(" Gols in life time  "+goals);
		System.out.println(" fifa in life   "+fifa);
		// TODO Auto-generated method stub
		
	}

}
