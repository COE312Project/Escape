package GameCharacters;

import java.util.Scanner;

import GameClock.Subject;
import Locations.*;

public class FriendlyPrisoner extends Prisoner implements Runnable, NPC
{
	Thread t;
	Yard yard;
	int nextDialog = 0;
	Boolean needHelp = false;
	Player player;
	public WardensOffice wOffice;
	GameAssets.GameMap map;
	// npc sends messages to your cell

	public FriendlyPrisoner(String n, Subject s, Location l, GameAssets.GameMap map, Yard y, Player p, WardensOffice office) {
		super(n, s, l);
		super.dialogs.add("\n["+this.name+"]:\n\t❝  Sorry, I don't talk to newbies. Show me what you can do on the basketball court and then we'll talk! ❞\n");
		super.dialogs.add("\n["+this.name+"]:\n\t❝  You seem like a good person. If you're looking to get out of here, I can help you... You in? [y/n] ❞\n");
		super.dialogs.add("\n["+this.name+"]:\n\t❝  Now that's a good decision!\nI've been in here longer than anybody else and I know the ins and outs of this place. "
				+ "\nI have managed to sketch out this entire prison.\nQuick, take this map before anyone sees! ❞\n"+
				"\n\t<< He hands you a folded, worn out piece of paper >> "+
				"\n\t<< Map added to inventory >>"+
				"\n["+this.name+"]:\n\t❝ It has all the locations and more importantly, I've managed to figure out all the camera positions, shown as 'C' ❞\n");
		super.dialogs.add("\n["+this.name+"]:\n\t❝  We need to sneak out at night, but there's cams everywhere and you can't step out after the curfew. "
				+ "\nLuckily, I have sources that tell me you can disable them from the Warden's computer in his office. \n"
				+ "\nUnfortunately, the warden never leaves unless there's a huge fight like the one that happened last week in the Cafeteria. ❞\n");
		super.dialogs.add("\n["+this.name+"]:\n\t❝  The bars in your Cell window are worn out, but you will need some heavy duty tools to break them.❞\n");
		super.dialogs.add("\n["+this.name+"]:\n\t❝  You should be able to figure out the rest on your own! ❞\n");
		
		
		this.desc = "\n You see an old guy sitting all alone on the benches. He glances at you with a reproachful look.\n"
				+ " This must be the famous " + this.name + " that you heard the other prisoners talking about...\n";


		this.player = p;
		this.inventory.add(map);
		this.map = map;
		this.yard = y;
		this.wOffice = office;
		this.t = new Thread(this);
		t.start();
	}

	public void talk() {
		System.out.println(dialogs.get(nextDialog));
		if(nextDialog == 1)
		{	
			Scanner cin = new Scanner(System.in);
			needHelp = (cin.nextLine().toLowerCase().charAt(0)=='y');
		}
		if(nextDialog == 2)
		{
			if(!this.inventory.isEmpty()) {
				player.inventory.add(this.inventory.get(0));
				inventory.remove(0);
			}
			nextDialog++;
		}
		if(nextDialog == 4)
			nextDialog++;
	}


	public Boolean defaultActivities() {
		if(this.time == 18  && this.loc != null) {
			// remove from Yard's list of prisoners
			this.loc.prisoners.remove(this);
			this.loc = null;
		}
		if (this.time == 8 && this.loc != yard) {
			// add to Yard's list of prisoners
			yard.prisoners.add(this);
			this.loc = yard;
		}
		if(this.yard.bb.won && nextDialog == 0) {
			nextDialog++;
			this.desc = this.name + " is sitting in his usual spot, brooding. ";
		}
		if(needHelp && nextDialog == 1)
			nextDialog++;
		if(this.wOffice.computer.camDisabled && nextDialog == 3)
			nextDialog++;
		else
			System.out.print("");
		
		return true;
	}

	public void run()
	{
		while(true)
		{
			this.defaultActivities();
		}
	}

}
