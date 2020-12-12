package GameCharacters;

import java.util.Random;

public class Guard extends Character implements Runnable, NPC{
	
	Thread t;
	Locations.Yard yard;
	Objects.YardKey key;
	
	public Guard(String n, GameClock.Subject s, Locations.Location l, Locations.Yard yard) {
		super(n,s,l);
		this.desc = "There's a surly looking guard standing nearby. He doesn't seem too pleased to see you!\n";
		this.yard = yard; 
		this.key = new Objects.YardKey(yard);
		this.inventory.add(key); // all guards have the key to yard
		super.loc.items.add(key);
		super.dialogs.add("Quit messing around!");
		super.dialogs.add("What are you looking at? Keep it moving!");
		super.dialogs.add("Did you finish your chores?!");
		super.dialogs.add("I need a raise but the dumb warden doesn't think I deserve it! Don't tell him I said that!");
		super.dialogs.add("Have you seen my fancy new keychain? I got it at Walmart for $29.99! What a steal!");
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

	public void talk() {
		Random r = new Random();
		System.out.println(this.dialogs.get(r.nextInt(dialogs.size())));
	}

}
