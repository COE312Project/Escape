package GameCharacters;

import GameClock.Subject;
import Locations.*;

public class Warden extends Guard{

	public Location cafe;
	public WardensOffice office;
	public Player player;
	
	public Warden(Subject s, Locations.WardensOffice w, Cafeteria cafe, Player player) {
		super("warden", s, w);
		this.office = w;
		this.cafe = cafe;
		this.player = player;
	}

	public void defaultActivities() throws Exception {
		if(this.loc.name == "WardensOffice" && !this.loc.prisoners.isEmpty()) {
			try {
				Thread.sleep(200); // so that the location title gets printed before warden freaks out
			} catch (InterruptedException e) {}
			System.out.println("\n[Warden]:\n❝ Hey! What are you doing in here?! That's it, solitary confinement for you! ❞");
			Main.End.end("caught");
		}
		else if(this.cafe.commotion)
		{
			Location office = this.loc;
			this.loc.guards.remove(this);
			this.loc = cafe;
			cafe.guards.add(this);
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {}
			
			this.loc.guards.remove(this);
			this.loc = office;
			this.loc.guards.add(this);
			
		}
		else if((this.time >= 19 || this.time <= 6) && !this.office.computer.camDisabled && !this.player.loc.name.equals("Cell")) {
			System.out.println("\n[Through the PA]:\n❝ Aha! You thought I wouldn't see you? Nothing gets past me. Guards, detain him!❞ ");
			Main.End.end("caught");
		}
		else
			System.out.print("");
	}
}
