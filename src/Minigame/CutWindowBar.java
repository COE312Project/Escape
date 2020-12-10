package Minigame;
import Sensor.TCP_Client;
import Sensor.coord;

public class CutWindowBar {

	public TCP_Client tcp;

	public CutWindowBar(){
		this.tcp = new TCP_Client();
	}
	
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

	public void cut() throws Exception
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
					Sound.Player.getInstance().play("scratch");
				System.out.print("#");	
				count++;
				Thread.sleep(100);
			}
			else
				System.out.print("");

		}
		//clear(100);
		System.out.println("\n\n");
		printWindow(true);
		//System.out.print("\t\t____________________________________________________________________________________________________\n\t\t####################################################################################################");

	}
}
