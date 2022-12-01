package com.abstraction;

public class AthletAppTest {
	
public static void main(String[] args) {
	

	BasketBall cobyBriant=new BasketBall("cobyBriant", "cobbb", 1992, "britan", 455,91.2,5250);
	BasketBall Johnydepp=new BasketBall("johnydepp", "depp", 19986, "america", 365,96.4,5810);
	BasketBall robertdowny=new BasketBall("robertdowny", "downy", 1990, "America", 465,96.5,6250);
	cobyBriant.getbioData();
	cobyBriant.getBodytype();
	cobyBriant.freeThrow();
	System.out.println("-------->>>>>");
	Johnydepp.getbioData();
	Johnydepp.getBodytype();
	Johnydepp.freeThrow();
	System.out.println("--------->>>>");
	robertdowny.getbioData();
	robertdowny.getBodytype();
	robertdowny.freeThrow();
	
	}


}

	
	
	