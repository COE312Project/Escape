package Locations;

import java.util.ArrayList;

public class Yard extends Location{

	public Yard(ArrayList<Outside.Prisoner> p, ArrayList<Outside.Guard>g) {

		this.name = "Cell";
		this.prisoners = p;
		this.guards = g;
		this.items.add(new Objects.Hacksaw());
		this.items.add(new Objects.Basketball());
	}
}
