package GameCharacters;

public class Guard extends Character implements Runnable, NPC{
	
	
	Thread t;
	
	public Guard(String n, GameClock.Subject s, String ip, int port) {
		super(n,s);
		this.inventory.add(new Objects.YardKey(ip, port)); // all guards have the key
		t = new Thread(this);
		t.start();
	}
	
	
	public void defaultActivities() {
		// all npc prisoners automatically go to cell, so if there is any prisoner in the same loc as guard, its the player
		if((this.time >= 19 || this.time <= 6) && !this.loc.prisoners.isEmpty()) 
		{
			System.out.print("YOU ARE CAUGHT!!! ");
			System.exit(0);
		}
	}
	
	public void run() 
	{
		while(true) {
			this.defaultActivities();			
		}
	}

}
