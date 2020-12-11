package GameCharacters;

import GameClock.Subject;

public class FriendlyPrisoner extends Prisoner implements Runnable
{

	Thread t;
	// npc sends messages to your cell

	
	FriendlyPrisoner(String n, Subject s, Locations.Location l, GameAssets.GameMap map) {
		super(n, s, l);
		//idk why but i gave him a mexican accent here
		setDialogueBehavior(new TalkToInteractiveNPC("Come-a to play basketball with us some-ay time eh?")); // this is Italian
		this.inventory.add(map);
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
