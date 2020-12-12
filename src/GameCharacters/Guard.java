package GameCharacters;

public class Guard extends NPC implements Runnable{
	
	Thread t;
	Locations.Yard yard;
	Objects.YardKey key;
	
	public Guard(String n, GameClock.Subject s, Locations.Location l, Locations.Yard yard) {
		super(n,s,l);
		this.yard = yard; 
		this.key = new Objects.YardKey(yard);
		this.inventory.add(key); // all guards have the key to yard
		super.loc.items.add(key);
		setDialogueBehavior(new TalkToInteractiveNPC("Where do you think you're you going, huh? Get back to your cell!"));
		t = new Thread(this);
		t.start();
	}
	
	public void defaultActivities() throws Exception {
		// all npc prisoners automatically go to cell, so if there is any prisoner in the same loc as guard, its the player
		if((this.time >= 19 || this.time <= 6) && this.loc != null && !this.loc.prisoners.isEmpty()) 
		{
			System.out.print("\n[Night Guard]:\n\t❝   You there! What are you doing outside your cell ?! ❞\n");
			Main.End.end("caught");
		}
		else
			System.out.print("");
	}
	
	public void run() 
	{
		try {
			Thread.sleep(2000); // for allowing ctxt to init
		} catch (InterruptedException e) {	}
		while(true) {
			try {
				defaultActivities();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
