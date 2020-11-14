package Minigame;
import Sensor.TCP_Client;
import Sensor.coord;

public class CutWindowBar {

	public TCP_Client tcp;

	CutWindowBar(String ip, int port){
		this.tcp = new TCP_Client(ip ,port);
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

	public void cut() throws InterruptedException
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
				System.out.print("##");	
				count+=2;
				Thread.sleep(25);
			}
			else
				System.out.print("");

		}
		clear(100);
		printWindow(true);
		System.out.print("\t\t____________________________________________________________________________________________________\n\t\t####################################################################################################");
		clear(33); //maximized console is 41 lines, 41-7 lines of wall = 34

	}
}
