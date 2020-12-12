package Minigames;
import Sensor.TCP_Client;
import Sensor.coord;

public class CutWindowBar extends SensorMinigame{


	
	public void clear(int n) {
		for(int i=0;i<n;i++)
			System.out.println("");
	}

	public void printWindow(boolean isBroken) 
	{
		String[] wall = new String[]{"|___|___|___|___|___|___|___|___|___|___|___|___|", 
				"|_|___|___|___|___|___|___|___|___|___|___|___|__", 
		"|___|___|___|___|___|___|___|___|___|___|___|___|"};

		System.out.println(wall[0] + "___|___|___|___|___|___|___" + wall[0]);
		System.out.println(wall[1]+"▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄"+wall[1]);
		for(int i=0; i<3; i++)
		{
			System.out.print(wall[i]);
			for(int j=0; j<20; j++)
			{
				if(i==1 && isBroken && j!=0 && j!=18 && j%2==0) System.out.print(" ");
				else if(j%2==0) System.out.print("█");
				else if(j!=19) System.out.print("  ");
			}
			System.out.println(wall[i]);
		}
		System.out.println(wall[1]+"▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀"+wall[1]);
		System.out.println(wall[0]+"___|___|___|___|___|___|___"+wall[0]);

	}

	public Boolean startGame()
	{

		//KEEP CONSOLE MAXIMIZED
		printWindow(false);

		System.out.println("\t\t____________________________________________________________________________________________________");
		System.out.print("\t\t");
		int count = 0;
		while(count < 100) {

			coord currAcc = tcp.accel;

			if(Math.abs(currAcc.x) + Math.abs(currAcc.y) + Math.abs(currAcc.z) > 25.0)
			{
				if(count == 1 ||count % 33 == 0)
					try {
						Sound.Player.getInstance().play("scratch");
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				System.out.print("#");	
				count++;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else
				System.out.print("");

		}
		//clear(100);
		System.out.println("\n\n");
		printWindow(true);
		//System.out.print("\t\t____________________________________________________________________________________________________\n\t\t####################################################################################################");
		return true;
	}
	public Boolean cut() {
		return super.play();
	}
}
