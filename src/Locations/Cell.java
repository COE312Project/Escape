package Locations;

import GameCharacters.*;

public class Cell extends Location {

	public Cell(Prisoner p) {
		
		this.name = "Cell";
		this.prisoners.add(p);
	}
}
