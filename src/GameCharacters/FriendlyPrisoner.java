package GameCharacters;

import GameClock.Subject;

public class FriendlyPrisoner extends Prisoner implements Runnable, NPC{

	Thread t;
	
	FriendlyPrisoner(String n, Subject s) {
		super(n, s);
		t = new Thread(this);
		t.start();
	}

	public void defaultActivities() {
		if(this.time >= 18 || this.time <= 7) {
			// remove from Yard's list of prisoners
		}
		else;
			// add to Yard's list of prisoners
	}
	
	public void run()
	{
		while(true)
		{
			this.defaultActivities();
		}
	}

}
