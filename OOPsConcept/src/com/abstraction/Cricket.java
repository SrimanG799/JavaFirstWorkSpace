package com.abstraction;

public class Cricket extends Athlete {
	int runs;
	int worldcup;
	
	public Cricket(String name, String nickName, int yearofborn, String team, int gamesplayed,int runs,int worldcuo) {
		super(name, nickName, yearofborn, team, gamesplayed);
		this.runs=runs;
		this.worldcup=worldcup;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getBodyType() {
		// TODO Auto-generated method stub
		System.out.println("having good visinary and strong sholders");
	}
	@Override
	public void achivements() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Total runs  "+runs);
		System.out.println(" world cups  "+worldcup);
	}

}
