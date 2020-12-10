package Locations;

public class ConstructionZone extends Location {

	public ConstructionZone()
	{
		super();
		this.name = "ConstructionZone";
		this.items.add(new Objects.Hacksaw());
	}
	
}
