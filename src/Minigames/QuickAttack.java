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
				
				w.t.interrupt();
				return false;
			}
		}
	}


	public void gameInstructions() {
		System.out.println("\t\t<< Quick! Attack or be attacked! >>");
	}
	
}
