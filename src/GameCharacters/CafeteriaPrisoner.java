package GameCharacters;

import java.util.Random;
import java.util.Scanner;

import GameClock.Subject;
import Locations.*;

public class CafeteriaPrisoner extends Prisoner implements Runnable, NPC
{
	Thread t;
	Cafeteria cafe;

	public CafeteriaPrisoner(String n, Subject s, Location l, Cafeteria c) {
		super(n, s, l);
		this.cafe = c;
		super.dialogs.add("\n["+this.name+"]:\n\t❝  Sup? Enjoying life in here?\n"
				+ "It's pretty good once you get used to it. No goddamn taxes to pay as well! ❞\n");
		super.dialogs.add("\n["+this.name+"]:\n\t❝  Did you meet my pal in the yard?"+"  ❞\n");
		super.dialogs.add("\n["+this.name+"]:\n\t❝   Missing your mama already huh? ❞\n");
		super.dialogs.add("\n["+this.name+"]:\n\t❝ Did you hear about the huge fight here yesterday?\n Man, Shaq almost killed that guy for spilling soup on him! ❞\n");
		super.dialogs.add("\n["+this.name+"]:\n\t❝ I heard the Warden volunteers at the Community Soup Kitchen. He really hates food waste... ❞\n");
		super.dialogs.add("\n["+this.name+"]:\n\t❝ Man, the food here is disgustin! ❞\n");


		this.desc = "\n Sitting among the other prisoners is "+this.name+" who introduced you to the prison the day before.\n";


		
		this.cafe.prisoners.add(this);
		this.t = new Thread(this);
		t.start();
	}

	public void talk() {
		Random r = new Random();
		System.out.println(this.dialogs.get(r.nextInt(dialogs.size())));
	}


	public Boolean defaultActivities() {
		if(this.time == 15  && this.loc != null) {
			// remove from cafe's list of prisoners
			this.loc.prisoners.remove(this);
			this.loc = null;
		}
		if (this.time == 8 && this.loc != cafe) {
			// add to cafe's list of prisoners
			cafe.prisoners.add(this);
			this.loc = cafe;
		}
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
