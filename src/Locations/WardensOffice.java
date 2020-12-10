package Locations;

import GameCharacters.*;

public class WardensOffice extends Location{

	public WardensOffice(Warden w)
	{
		super();
		this.name = "WardensOffice";
		this.guards.add(w);
		this.items.add(new Objects.Paperclip());
		this.items.add(new Objects.Computer());
	}

}
