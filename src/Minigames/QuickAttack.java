package Minigames;

import Sensor.TCP_Client;
import Sensor.coord;
import java.lang.Math;

public class QuickAttack extends SensorMinigame{
	
	Watch w;
	
	
	public Boolean startGame() 
	{
		this.w = new Watch(3);
		this.w.t.start();
		while(true)
		{
			coord currAcc = this.tcp.accel;
			System.out.print("");
			if(Math.abs(currAcc.x) > 15 || Math.abs(currAcc.y) > 15 || Math.abs(currAcc.z) > 15)
			{
				try {
					Sound.Player.getInstance().play("hit");
				} catch (Exception e) {	}
				System.out.println("\nYou performed a quick attack!\n"
						+ "While the guard is falling unconsious,"
						+ "\nYou lay him down quietly as to not alarm the other guards.");
				w.t.interrupt();
				return true;
			}
		}
	}
	
}
