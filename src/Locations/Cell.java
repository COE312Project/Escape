package Locations;

import GameCharacters.*;

public class Cell extends Location {
	
	public Cell()
	{
		super();
		this.name = "Cell";
	}
	
	public Cell(Prisoner p, Location n, Location s, Location e, Location w) {
		super(n,s,e,w);
		this.name = "Cell";
		this.prisoners.add(p);
	}
}
