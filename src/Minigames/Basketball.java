package Minigames;

import Sensor.TCP_Client;
import Sensor.coord;
import Sound.Player;

public class Basketball extends SensorMinigame {
	int score = 0;
		
	public Boolean startGame() {
	
		System.out.println("Score 7 to win:");
		int score = 0;
		while (score < 7) {
			try {
				coord curAcc = this.tcp.accel;
				coord curRot = this.tcp.rot;

				if (curAcc.y > 16 || curAcc.z > 16 && !(curRot.y > 0.7)) {
					System.out.println("\tPerfect Shot! Thats a 3 pointer! \n\t<< Score:"+ score +" >>\n");
					score+=3;
					Sound.Player.getInstance().play("basketball_hit");
					Thread.sleep(500);
				} else if (curAcc.y > 12 || curAcc.z > 12 && !(curRot.y > 0.7)) {
					System.out.println("\tGood Shot!");
					score++;
					Sound.Player.getInstance().play("basketball_hit");
					Thread.sleep(500);
				} else {
					System.out.print("");
					//Sound.Player.getInstance().play("boo");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return true;
	}


}
