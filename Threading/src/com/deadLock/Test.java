package com.deadLock;

public class Test {
	public static void main(String[] args) {
		Gun gun=new Gun();
		Bullet bullet=new Bullet();
		Hero hero=new Hero(gun, bullet);
		Villan villan=new Villan(gun, bullet);
		hero.start();
		villan.start();
	}

}
