package com.abstraction;

public class AthleteTest {
	public static void main(String[] args)
	{
		
		
		Cricket sachin=new Cricket("sachinTendulkar", "sachin", 1980, "india", 1000,12000,3);
		Cricket dhoni=new Cricket("mahindra Dhoni","dhoni",1985,"india",850,6000,2);
		FootBall CrisHams=new FootBall("crisHamsWarth","cris",1986,"america",500,800,3);
		FootBall ArnoldScrav=new FootBall("ArnoldScrawndz", "arnold", 1987, "america", 643,750,3);
		Athlete[] players= {sachin,dhoni,CrisHams,ArnoldScrav};
		 for(Athlete athlete:players)
		 {
			 athlete.getBioData();
			 athlete.getBodyType();
			 athlete.achivements();
		 }
		
		
		
	}

}
