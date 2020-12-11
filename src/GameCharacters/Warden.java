package GameCharacters;

import GameClock.Subject;

public class Warden extends Guard{

	public Warden(Subject s, Locations.Location l) {
		super("warden", s, l);
	}

	public void defaultActivities() {
		if(this.loc.name == "WardensOffice" && !this.loc.prisoners.isEmpty()) {
			try {
				Thread.sleep(200); // so that the location title gets printed before warden freaks out
			} catch (InterruptedException e) {}
			System.out.println("\nHey! What are you doing in here?! That's it, solitary confinement for you!");
			System.exit(0);
		}
		else
			System.out.print("");
	}
}
