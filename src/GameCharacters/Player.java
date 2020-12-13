package GameCharacters;

public class Player extends Prisoner implements Runnable
{
	Thread t;
	Boolean warned = false;
	//public GameAssets.GameMap map = null;
	
	public Player(String n, GameClock.Subject s, Locations.Location l)
	{
		super(n, s, l);
		t = new Thread(this);
		t.start();
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
		}
	}
}
