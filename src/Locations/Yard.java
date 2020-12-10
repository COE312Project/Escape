package Locations;

import java.util.ArrayList;
import GameCharacters.*;

public class Yard extends Location{

	ConstructionZone cz;
	
	public Yard(ArrayList<Prisoner> p, ArrayList<Guard>g, String ip, int port, ConstructionZone cz, Location n, Location s, Location e, Location w) {
		super(n,s,e,w);
		this.name = "Yard";
		this.prisoners = p;
		this.guards = g;
		this.items.add(new Objects.Basketball(ip, port));
		this.cz = cz;
	}
}
