package Locations;

public class ConstructionZone extends Location {

	public ConstructionZone()
	{
		super();
		this.name = "ConstructionZone";
		this.items.add(new Objects.Hacksaw());
		this.nightDesc = "There is an eerie silence around you, without the noise from the workers drilling and digging in the mornings. \n"
				+ "They have dug a pretty deep pit and in the corner, there is a hacksaw left by the workers. ";
		this.sDesc = "The yard is empty and there looks to be no one around. ";
	}
	
}