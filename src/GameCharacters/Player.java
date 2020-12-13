package GameCharacters;
import Minigames.*;

public class Player extends Prisoner implements Runnable
{
	Thread t;
	Boolean warned = false;
	Boolean beenAmbushed = false;
	//public GameAssets.GameMap map = null;

	public Player(String n, GameClock.Subject s, Locations.Location l)
	{
		super(n, s, l);
		t = new Thread(this);
		t.start();
	}

	void ambush(int n) {
		try {
			System.out.println("\n\t<< You turn around to see five guards looking at you! >>");
			Sound.Player.getInstance().play("ambushSurprise");
			Thread.sleep(1000);
			System.out.print("\n[Guard]:\n\t❝   This is gonna be fun! ❞\n");
			Thread.sleep(1000);
	
			for(int i = 0; i < n; i++)
			{
				new QuickAttack().play();
				System.out.println("\n\t\t<< "+(i+1)+"x >>");
				Thread.sleep(750);
			}
			System.out.print("\n Bodies hit the ground as you swing your hacksaw left and right!"
					+ "\n You take a moment to catch your breath and hope no one heard anything...\n> ");
			
		} catch (Exception e) {}
	}

	public void run() {
		while(true) {
			if(this.time == 18) {
				if(!warned) {
					System.out.print("\n[Through PA]:\n\t<< It's 6:00 pm! You have 1 hour to return to your cell. >>\n> ");
					try {
						Sound.Player.getInstance().play("curfewAlarm");
					} catch (Exception e) {
						e.printStackTrace();
					}
					warned = true;
				}
			}
			else {
				System.out.print("");
				warned = false;
			}
			if(!beenAmbushed) {
				for(Objects.Item i : this.inventory)
					if(i.name.equalsIgnoreCase("hacksaw"))
					{
						ambush(5);
						beenAmbushed = true;
					}
			}
		}
	}
}
