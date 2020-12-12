package Locations;

public class ConstructionZone extends Location {

	public ConstructionZone()
	{
		super();
		this.name = "ConstructionZone";
		this.items.add(new Objects.Hacksaw());
		this.nightDesc = "\nThere is an eerie silence around you, without the noise from the workers drilling and digging in the mornings. \n"
				+ "\nThey have dug a pretty deep pit, one could even fit a body in there... if one needed to. \n";
		this.sDesc = "\nThe yard is empty and there looks to be no one around. ";
		super.isLocked = true;
	}
	
	
}