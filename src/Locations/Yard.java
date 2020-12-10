package Locations;

import java.util.ArrayList;
import GameCharacters.*;

public class Yard extends Location{

	ConstructionZone cz;

	public Yard(ArrayList<Prisoner> p, ArrayList<Guard>g, ConstructionZone cz)
	{
		this.name = "Yard";
		this.prisoners = p;
		this.guards = g;
		this.items.add(new Objects.Basketball());
		this.cz = cz;
	}
	
}
