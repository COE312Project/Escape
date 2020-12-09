package Minigame;

import Sensor.TCP_Client;
import Sensor.coord;
import Sound.Player;

public class Basketball {
	TCP_Client tcp;
	int score = 0;
	public Basketball() {
		this.tcp = new TCP_Client("127.0.0.1", 1234);
	}

	public Basketball(String ip, int port) {
		this.tcp = new TCP_Client(ip, port);
	}

	public void play() {
		System.out.println("Score 5 to win:");
		while (score < 5) {
			try {
				coord curAcc = this.tcp.accel;
				coord curRot = this.tcp.rot;

				if (curAcc.y > 15 || curAcc.z > 15 && !(curRot.y > 0.7)) {
					System.out.println("\tNice Shot!");
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
	}

}
