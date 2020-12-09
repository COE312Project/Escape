package Locations;

public class Cell extends Location {

	public Cell(Outside.Prisoner p) {
		
		this.name = "Cell";
		this.prisoners.add(p);
	}
}
