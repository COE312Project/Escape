package Minigame;

import Sensor.TCP_Client;
import Sensor.coord;


public class Pocket {

	TCP_Client tcp;
	int progress = 0;

	public Pocket() {
		this.tcp = new TCP_Client();
	}

	public void pick() throws InterruptedException
	{
		System.out.println("           ___..__\r\n" + 
				"  __..--\"\"\" ._ __.'\r\n" + 
				"              \"-..__\r\n" + 
				"            '\"--..__\";\t\t\t\t\t\t\t\t\t\t\t\t\t\t ,o.          8 8\r\n" + 
				" ___        '--...__\"\";\t\t\t\t\t\t\t\t\t\t\t\t\t\td   bzzzzzzzza8o8b\r\n" + 
				"    `-..__ '\"---..._;\"\t\t\t\t\t\t\t\t\t\t\t\t\t\t `o'\r\n" + 
				"          \"\"\"\"----'     ");
		System.out.print("\t\t\t____________________________________________________________________________________________________\n\t\t\t");

		while (true)
		{
			coord curGyro = this.tcp.gyro;
			System.out.print("");
			
			if (curGyro.x > 2.0 || curGyro.y > 2.0 ||  curGyro.z > 2.0) {
				System.out.println("\n\t\t\t\t\t\t\t\tYou alerted the guard!");
				return;
			}
			
			if ((curGyro.x > 0.5 && curGyro.x < 2.0) || (curGyro.y > 0.5 && curGyro.y < 2.0) || (curGyro.z > 0.5 && curGyro.z < 2.0))
			{
				progress++;
				System.out.print("##");
				Thread.sleep(100);
				if(progress == 50) {
					
					System.out.println("\n\t\t\t\t\t\t\t\tPerfect...\n\t\t\t\t\t\t\tItem added to inventory!");
					return;
				}
			}
		}
	}

}
