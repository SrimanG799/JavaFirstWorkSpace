package com.deadLock;

public class Hero extends Thread{
	
	private Gun gun;
	private Bullet bullet;
	/**
	 * @param gun
	 * @param bullet
	 */
	public Hero(Gun gun, Bullet bullet) {
		this.gun = gun;
		this.bullet = bullet;
	}
	public void run()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized(gun)
		{
			System.out.println("hero got gun waiting for Bullets");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(bullet)
			{
				System.out.println("Hero got bullets and kill villan");
			}
			
		}
	}

}
