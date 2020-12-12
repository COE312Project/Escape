package GameCharacters;

import GameClock.Subject;
import Locations.*;

public class Warden extends Guard{

	public Cafeteria cafe;
	public WardensOffice office;
	public Player player;
	public Guard yardGuard;
	public Boolean doNightJobs = true;
	public Boolean doDayJobs = false;
	
	public Warden(Subject s, WardensOffice w, Cafeteria cafe, Player player, Yard yard) {
		super("warden", s, w, yard);
		this.office = w;
		this.cafe = cafe;
		this.player = player;
		this.yardGuard = super.yard.guards.get(0);
	}

	public void defaultActivities() throws Exception {
		if(this.loc.name == "WardensOffice" && !this.loc.prisoners.isEmpty()) {
			try {
				Thread.sleep(200); // so that the location title gets printed before warden freaks out
			} catch (InterruptedException e) {}
			System.out.println("\n[Warden]:\n\t❝  Hey! What are you doing in here?! That's it, solitary confinement for you! ❞\n");
			Main.End.end("caught");
		}
		if(this.cafe.commotion)
		{
			Location office = this.loc;
			this.loc.guards.remove(this);
			this.loc = cafe;
			cafe.guards.add(this);
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {}

			this.loc.guards.remove(this);
			this.loc = office;
			this.loc.guards.add(this);
			this.cafe.commotion = false; // settled the fights
		
		}
		if((this.time >= 19 || this.time <= 6) && !this.office.computer.camDisabled && !this.player.loc.name.equals("Cell")) {
			System.out.println("\n[Through the PA]:\n\t❝   Aha! You thought I wouldn't see you? Nothing gets past me. Guards, detain him! ❞\n");
			Main.End.end("caught");
		}

		if(this.time == 19 && doNightJobs)
		{
			//System.out.println("im doing my night jobs");
			super.yard.isLocked = true; // lock at night
			super.yard.north.isLocked = false; // constr zone is accessible at night
			Thread.sleep(200);
			this.yardGuard.loc = null; // sent home
			super.yard.guards.remove(this.yardGuard);
			doNightJobs = false;
			doDayJobs = true;

		}
		if(time == 7 && doDayJobs) //
		{
			super.yard.isLocked = false; // normal unlock in morning
			super.yard.north.isLocked = true; // constr zone is inaccessible during the day
			
			super.yard.guards.add(this.yardGuard);
			this.yardGuard.loc = super.yard;
			doDayJobs = false;
			doNightJobs = true;

		}
		else 
			System.out.print("");
	}
}
