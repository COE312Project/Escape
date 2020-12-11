package Locations;

import java.util.ArrayList;
import GameCharacters.*;

public class Yard extends Location{

	ConstructionZone cz;

	public Yard(ArrayList<Prisoner> p, ArrayList<Guard>g, ConstructionZone cz)
	{
		this.name = "Yard";
		super.desc = "The Prison Yard is full of activity. Some are playing basketball while others are just hanging out. "
				+ "Most of them seem to be in gangs but you see an old guy sitting all alone on the benches. ";
		super.wDesc = "To the West, is the door to through which you entered. ";
		super.nDesc = "You also notice some construction work going on in the North-West corner. ";
		
		super.nightDesc = "The Yard is completely empty at night and you get a little spooked. The construction zone is now emtpy as all the workers have gone home. ";
		
		this.prisoners = p;
		this.guards = g;
		this.items.add(new Objects.Basketball());
		this.cz = cz;
	}
	
}
