package Locations;

public class Cafeteria extends Location{

	public Cafeteria()
	{
		super();
		this.name = "Cafeteria";
		this.items.add(new Objects.Food());
		this.desc = "The cafeteria is filled with prisoners lazing around after completing their chores.\nYou consider refueling for the rest of the day";
		this.wDesc = "The door to your left is the West corridor.";
	}
	
}
