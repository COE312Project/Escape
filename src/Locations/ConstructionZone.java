package Locations;

public class ConstructionZone extends Location {

	public ConstructionZone(Location n, Location s, Location e, Location w) {
		super(n,s,e,w);
		this.name = "ConstructionZone";
		this.items.add(new Objects.Hacksaw());
	}
}
