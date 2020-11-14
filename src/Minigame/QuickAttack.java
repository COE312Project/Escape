package Minigame;

import Sensor.TCP_Client;
import Sensor.coord;
import java.lang.Math;

public class QuickAttack {
	
	TCP_Client tcp;
	Watch w;
	public QuickAttack(String ip, int port)
	{
		this.tcp = new TCP_Client(ip, port);
		this.w = new Watch();
	}
	
	public void attack()
	{
		this.w.t.start();
		while(true)
		{
			//System.out.println("reached here");
			coord currAcc = this.tcp.accel;
			System.out.print("");
			if(Math.abs(currAcc.x) > 15 || Math.abs(currAcc.y) > 15 || Math.abs(currAcc.z) > 15)
			{
				System.out.println("\nPikachu performed Quick Attack!\nIt was super effective!");
				w.t.interrupt();
				return;
			}
		}
	}
	
}
