package Locations;

import GameCharacters.*;

public class WardensOffice extends Location{

	public WardensOffice(Guard warden, Location n, Location s, Location e, Location w) {
		
		super(n,s,e,w);
		this.name = "WardensOffice";
		this.guards.add(warden);
		this.items.add(new Objects.Paperclip());
		this.items.add(new Objects.Computer());
	}
}
