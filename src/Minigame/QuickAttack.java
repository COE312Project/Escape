package Minigame;

import Sensor.TCP_Client;
import Sensor.coord;
import java.lang.Math;

public class QuickAttack {
	
	TCP_Client tcp;
	Watch w;
	public QuickAttack()
	{
		this.tcp = new TCP_Client();
		this.w = new Watch(3);
	}
	
	public void attack() throws Exception
	{
		this.w.t.start();
		while(true)
		{
			coord currAcc = this.tcp.accel;
			System.out.print("");
			if(Math.abs(currAcc.x) > 15 || Math.abs(currAcc.y) > 15 || Math.abs(currAcc.z) > 15)
			{
				System.out.println("\nPikachu performed Quick Attack!\nIt was super effective!");
				Sound.Player.getInstance().play("hit");
				w.t.interrupt();
				return;
			}
		}
	}
	
}
