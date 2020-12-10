package Minigame;
import java.util.Random;
import Sensor.TCP_Client;
import Sensor.coord;

public class LockPick 
{

	Random r = new Random();
	TCP_Client tcp; // = new TCP_Client("192.168.1.112",23232);
	String[] arrow = new String[] {"↑","↓","←","→"};
	/*
	 * ↑ = Phone facing you, upright
	 * ↓ = Phone upside down, away from you
	 * ← = Phone facing left
	 * → = Phone facing right
	 */
	public LockPick()
	{
		this.tcp = new TCP_Client();
	}
	
	public void pick() throws Exception
	{
		System.out.println("\t\t     .--------.\r\n" + 
				"\t\t    / .------. \\\r\n" + 
				"\t\t   / /        \\ \\\r\n" + 
				"\t\t   | |        | |\r\n" + 
				"\t\t  _| |________| |_\r\n" + 
				"\t\t.' |_|        |_| '.\r\n" + 
				"\t\t'._____ ____ _____.'\r\n" + 
				"\t\t|     .'____'.     |\r\n" + 
				"\t\t'.__.'.'    '.'.__.'\r\n" + 
				"\t\t'.__  |      |  __.'\r\n" + 
				"\t\t|   '.'.____.'.'   |\r\n" + 
				"\t\t'.____'.____.'____.'   \r\n" + 
				"\t\t'.________________.'");
		System.out.println("\n");
	
		for(int i = 0; i < 7; i++)
		{
			int d = r.nextInt(4);
			System.out.print("\t\t      " + arrow[d]);
			Boolean correct = null;
			while(true)
			{
				coord acc = tcp.accel;

				if(acc.y > 8)
				{
					if(d == 0)
						correct = true;
					else
						correct = false;
					break;
				}
				else if(acc.y < -8)
				{
					if(d == 1)
						correct = true;
					else
						correct = false;
					break;
				}
				else if(acc.x > 8)
				{
					if(d == 2)
						correct = true;
					else
						correct = false;
					break;
				}
				else if(acc.x < -8)
				{
					if(d == 3)
						correct = true;
					else
						correct = false;
					break;
				}
				else
					System.out.print("");
			}

			if(correct)
			{
				System.out.println("\t✓");
				Sound.Player.getInstance().play("lock");
				Thread.sleep(1000);
			}
			else
			{
				System.out.println("\t✗");
				System.out.println("\n\t----You messed up. Start Over!----\n");
				i = -1;
			}

			Thread.sleep(1000);

		}

		System.out.println("\n\t     .--------.\r\n" + 
				"\t    / .------. \\\r\n" + 
				"\t   / /        \\ \\\r\n" + 
				"\t   | |         | |        \r\n" + 
				"\t   | |        _| |___________\r\n" + 
				"\t            .' |_|         |_|'.\r\n" + 
				"\t            '._____ ____ _____.'\r\n" + 
				"\t            |     .'____'.     |\r\n" + 
				"\t            '.__.'.'    '.'.__.'\r\n" + 
				"\t            '.__  |      |  __.'\r\n" + 
				"\t            |   '.'.____.'.'   |\r\n" + 
				"\t            '.____'.____.'____.'\r\n" + 
				"\t            '.________________.'");

	}
}
