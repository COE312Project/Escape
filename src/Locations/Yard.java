package Locations;

import java.util.ArrayList;
import GameCharacters.*;

public class Yard extends Location{

	public Yard(ArrayList<Prisoner> p, ArrayList<Guard>g) {

		this.name = "Cell";
		this.prisoners = p;
		this.guards = g;
		this.items.add(new Objects.Hacksaw());
		this.items.add(new Objects.Basketball());
	}
}
