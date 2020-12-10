package GameCharacters;

public class Guard extends NPC implements Runnable{
	
	Thread t;
	
	public Guard(String n, GameClock.Subject s) {
		super(n,s);
		this.inventory.add(new Objects.YardKey()); // all guards have the key
		setDialogueBehavior(new TalkToInteractiveNPC("Where do you think you're you going, huh? Get back to your cell!"));
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
