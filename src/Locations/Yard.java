package Locations;

import java.util.ArrayList;
import GameCharacters.*;

public class Yard extends Location{

	public Yard(ArrayList<Prisoner> p, ArrayList<Guard>g, String ip, int port) {

		this.name = "Yard";
		this.prisoners = p;
		this.guards = g;
		this.items.add(new Objects.Hacksaw(ip, port));
		this.items.add(new Objects.Basketball(ip, port));
	}
}
