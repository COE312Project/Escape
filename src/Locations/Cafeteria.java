package Locations;

public class Cafeteria extends Location{

	public Cafeteria()
	{
		super();
		this.name = "Cafeteria";
		this.items.add(new Objects.Food());
	}
	
}
