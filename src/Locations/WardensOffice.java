package Locations;

import GameCharacters.*;

public class WardensOffice extends Location{

	public WardensOffice(Warden w)
	{
		super();
		this.name = "WardensOffice";
		w.inventory.add(new Objects.Paperclip());
		this.guards.add(w);
		this.items.add(new Objects.Computer());
	}

}
