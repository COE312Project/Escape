package Minigames;

import Sensor.TCP_Client;
import Sensor.coord;


public class Pocket extends SensorMinigame {

	int progress = 0;

	
	public Boolean startGame()
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
				System.out.print("\n[Guard]:\n❝    What the hell do you think you're doing with your hand in my pocket, huh ?! ❞\n");
				try {
					Game.End.end("caught");
				} catch (InterruptedException e) {}
				return false;
			}
			
			if ((curGyro.x > 0.5 && curGyro.x < 2.0) || (curGyro.y > 0.5 && curGyro.y < 2.0) || (curGyro.z > 0.5 && curGyro.z < 2.0))
			{
				progress++;
				System.out.print("##");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {}
				if(progress == 50) {
					
					System.out.println("\n\t\t\t\t\t\t\t\t<< Perfect...\n\t\t\t\t\t\t\tItem added to inventory! >>");
					return true;
				}
			}
		}
	}
	
	public Boolean pick() {
		return super.play();
	}

	public void gameInstructions() {
		System.out.println("\n\t<< Move your hand slowly as to not alert the guard. >>\n");
	}

}
