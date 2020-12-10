package Locations;

import GameCharacters.*;

public class WardensOffice extends Location{

	public WardensOffice()
	{
		super();
		this.name = "WardensOffice";
		Warden g = new Warden(new GameClock.Clock());
		this.guards.add(g);
		this.items.add(new Objects.Paperclip());
		this.items.add(new Objects.Computer());
	}
	
	public WardensOffice(Location n, Location s, Location e, Location w) {
		super(n,s,e,w);
		this.name = "WardensOffice";
		Warden g = new Warden(new GameClock.Clock());
		this.guards.add(g);
		this.items.add(new Objects.Paperclip());
		this.items.add(new Objects.Computer());
	}
}
