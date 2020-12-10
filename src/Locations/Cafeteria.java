package Locations;

public class Cafeteria extends Location{

	public Cafeteria(Location n, Location s, Location e, Location w) {
		super(n,s,e,w);
		this.name = "Cafeteria";
		this.items.add(new Objects.Food());
	}
}
