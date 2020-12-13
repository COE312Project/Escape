package GameCharacters;

import GameClock.Subject;
import Locations.*;
import Objects.Food;

public class Warden extends Guard{

	public Cafeteria cafe;
	public WardensOffice office;
	public Player player;
	public Guard yardGuard;
	public Boolean doNightJobs = true;
	public Boolean doDayJobs = false;
	
	public Warden(Subject s, WardensOffice w, Cafeteria cafe, Player player, Yard yard) {
		super("Wallace", s, w, yard);
		super.inventory.remove(super.key);
		super.loc.items.remove(super.key);
		super.dialogs.clear();
		super.dialogs.add("\n[Warden "+this.name+"]:\n\t❝  I won the Best Prison Warden Award in 2016, 2017 and 2019!   ❞\n");
		nB = new WardenNight();
		this.desc = "The warden looks super angry!";
		this.office = w;
		this.cafe = cafe;
		this.player = player;
		this.yardGuard = super.yard.guards.get(0);
	}

	public Boolean defaultActivities() throws Exception {
		if(this.loc.name == "WardensOffice" && !this.loc.prisoners.isEmpty()) {
			try {
				Thread.sleep(200); // so that the location title gets printed before warden freaks out
			} catch (InterruptedException e) {}
			System.out.println("\n[Warden "+this.name+"]:\n\t❝  Hey! What are you doing in here?! That's it, solitary confinement for you! ❞\n");
			Game.End.end("caught");
		}
		if(this.cafe.commotion)
		{
			Location office = this.loc;
			this.loc.guards.remove(this);
			this.loc = cafe;
			cafe.guards.add(this);
			try {
				Thread.sleep(120000);
			} catch (InterruptedException e) {}

			this.loc.guards.remove(this);
			this.loc = office;
			this.loc.guards.add(this);
			this.cafe.commotion = false; // settled the fights
		
		}
		if((this.time >= 19 || this.time <= 6) && !this.office.computer.camDisabled && !this.player.loc.name.equals("Cell")) {
			nB.doTasks("Through PA");
		}
		if(this.time == 16 && !cafe.isLocked) {
			cafe.isLocked = true;
		}
		if(this.time == 19 && doNightJobs)
		{
			//System.out.println("im doing my night jobs");
			super.yard.isLocked = true; // lock at night
			cafe.west.north.isLocked = true; // lock cell (actually locks the north corridor)
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
			cafe.isLocked = false;
			super.yard.north.isLocked = true; // constr zone is inaccessible during the day
			cafe.west.north.isLocked = false; // unlock cell
			if(cafe.items.isEmpty())
				cafe.items.add(new Objects.Food());
			super.yard.guards.add(this.yardGuard);
			this.yardGuard.loc = super.yard;
			doDayJobs = false;
			doNightJobs = true;
			System.out.print("\n[Through PA]:\n\t<< Rise and shine!!! >>\n> ");

		}
		else 
			System.out.print("");
		
		return true;
	}
}
