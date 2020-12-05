package Minigame;

import Sensor.TCP_Client;
import Sensor.coord;

public class Pocket {

	TCP_Client tcp;
	Watch w;

	Pocket(String ip, int port) {
		this.tcp = new TCP_Client(ip, port);
		this.w = new Watch(5);
	}

	void pick()
	{
		this.w.t.start();
		while (true)
		{
			coord curAcc = this.tcp.accel;
			System.out.print("");
			if ((curAcc.x > 0.5 && curAcc.x < 1.5) || (curAcc.y > 0.5 && curAcc.y < 1.5) || (curAcc.z > 0.5 && curAcc.z < 1.5))
			{
				System.out.println("Perfect...\nItem added to inventory!");
				w.t.interrupt();
				return;
			}
		}
	}

	public static void main(String[] args) {
		(new Pocket("192.168.0.159",23232)).pick();
	}
}
