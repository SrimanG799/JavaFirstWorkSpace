package com.deadLock;

public class Villan extends Thread{
	private Gun gun;
	private Bullet bullet;
	/**
	 * @param gun
	 * @param bullet
	 */
	public Villan(Gun gun, Bullet bullet) {
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
		synchronized(bullet)
		{
			System.out.println("villan got bullets and wait for gun");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(gun)
			{
				System.out.println("villan got gun and kill hero");
			}
		}
	}

}
