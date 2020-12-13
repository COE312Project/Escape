package Minigames;

import Sensor.TCP_Client;
import Sensor.coord;
import Sound.Player;

public class Basketball extends SensorMinigame {
	int score = 0;

	public Boolean startGame() {

		System.out.println("\n"
				+ "                    ▒▒▒▒██▒▒▒▒                  \n"
				+ "                ▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▒▒              \n"
				+ "              ▒▒▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▒▒▒▒            \n"
				+ "            ▒▒██▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▒▒██▒▒          \n"
				+ "          ▒▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒▒        \n"
				+ "          ▒▒▒▒▒▒▒▒██▒▒▒▒██▒▒▒▒██▒▒▒▒▒▒▒▒        \n"
				+ "        ▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██▒▒▒▒██▒▒▒▒▒▒▒▒▒▒      \n"
				+ "        ▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██▒▒▒▒██▒▒▒▒▒▒▒▒▒▒      \n"
				+ "        ██████████████████████████████████     \n"
				+ "        ▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██▒▒▒▒██▒▒▒▒▒▒▒▒▒▒      \n"
				+ "        ▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██▒▒▒▒██▒▒▒▒▒▒▒▒▒▒      \n"
				+ "          ▒▒▒▒▒▒▒▒██▒▒▒▒██▒▒▒▒██▒▒▒▒▒▒▒▒        \n"
				+ "          ▒▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒▒        \n"
				+ "            ▒▒██▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▒▒██▒▒          \n"
				+ "              ▒▒▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▒▒▒▒            \n"
				+ "                ▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▒▒              \n"
				+ "                    ▒▒▒▒██▒▒▒▒                  \n\n");

		int score = 0;
		while (score < 7) {
			try {
				coord curAcc = this.tcp.accel;
				coord curRot = this.tcp.rot;

				if (curAcc.y > 16 || curAcc.z > 16 && !(curRot.y > 0.7)) {
					score += 3;
					System.out.println("\tPerfect Shot! Thats a 3 pointer! \n\t<< Score:" + score + " >>\n");
					System.out.println("\n" + 
							"\n" +  
							"       ▄▄████████████████▄▄ \n" + 
							"     ▄█                    █▄\n" + 
							"   ▄█                        █▄\n" + 
							"    ▀█▄                    ▄█▀\n" + 
							"      ▀█▄▄.--\"--..  ▄▄▄▄▄▄▀\n" + 
							"        /'  /      /. \n" + 
							"       |   |    _-'  \\\n" + 
							"      ||  |   ,'     \\\n" + 
							"      | \\ |   |     / |\n" + 
							"       |_\\ L  L  .-' |\n" + 
							"        \\.)`-.;-;__./\n" + 
							"          \"-._;_.-\"\n" + 
							"\n\n");
					Sound.Player.getInstance().play("basketball_hit");
					Thread.sleep(500);
				} else if (curAcc.y > 12 || curAcc.z > 12 && !(curRot.y > 0.7)) {
					score++;
					System.out.println("\tGood Shot!\n\t<< Score:" + score + " >>\n");
					Sound.Player.getInstance().play("basketball_hit");
					Thread.sleep(500);
				} else {
					System.out.print("");
					// Sound.Player.getInstance().play("boo");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	public void gameInstructions() {
		System.out.println("Score 7 to win:");
	}

}
