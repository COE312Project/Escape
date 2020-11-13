package Minigame;

import Sensor.TCP_Client;
import Sensor.coord;

public class Basketball
{
	TCP_Client tcp;
	Basketball(String ip, int port)
	{
		this.tcp = new TCP_Client(ip, port);
	}
	void play()
	{
		while(true)
		{
			coord curAcc = this.tcp.accel;
			coord curRot = this.tcp.rot;
			
			if(curAcc.y > 15 || curAcc.z > 15 && !(curRot.y > 0.7))
				System.out.println("Nice Shot!");
			else
				System.out.println("nah");
		}
	}
	
	
	public static void main(String[] args) {
		(new Basketball("192.168.0.135",23232)).play();
	}
	
	
}
