package GameCharacters;

import java.util.Random;

public class Guard extends Character implements Runnable, NPC{
	
	Thread t;
	Locations.Yard yard;
	Objects.YardKey key;

	NightBehaviour nB = new NightGuard();
	
	public Guard(String n, GameClock.Subject s, Locations.Location l, Locations.Yard yard) {
		super(n,s,l);
		this.desc = "There's a surly looking guard standing nearby. He doesn't seem too pleased to see you!\n";
		this.yard = yard; 
		this.key = new Objects.YardKey(yard);
		this.inventory.add(key); // all guards have the key to yard
		super.loc.items.add(key);
		super.dialogs.add("\n[Guard]:\n\t❝  Quit messing around! ❞\n");
		super.dialogs.add("\n[Guard]:\n\t❝  What are you looking at? Keep it moving! ❞\n");
		super.dialogs.add("\n[Guard]:\n\t❝  Did you finish your chores?! ❞\n");
		super.dialogs.add("\n[Guard]:\n\t❝  I need a raise but the dumb warden doesn't think I deserve it! Don't tell him I said that! ❞\n");
		super.dialogs.add("\n[Guard]:\n\t❝  Have you seen my fancy new keychain? I got it at Walmart for $29.99! What a steal! ❞\n");
		t = new Thread(this);
		t.start();
	}
	
	public Boolean defaultActivities() throws Exception {
		// all npc prisoners automatically go to cell, so if there is any prisoner in the same loc as guard, its the player
		if((this.time >= 19 || this.time <= 6) && this.loc != null && !this.loc.prisoners.isEmpty()) 
		{
			return nB.doTasks("Night Guard");
		}
		else
			System.out.print("");
		
		return true;
	}
	
	public void run() 
	{
		try {
			Thread.sleep(2000); // for allowing ctxt to init
		} catch (InterruptedException e) {	}
		while(true) {
			try {
				if(!defaultActivities())
					break;
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
