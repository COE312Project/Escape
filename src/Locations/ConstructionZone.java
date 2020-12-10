package Locations;

public class ConstructionZone extends Location {

	public ConstructionZone(String ip, int port) {
		this.name = "ConstructionZone";
		this.items.add(new Objects.Hacksaw(ip, port));
	}
}
