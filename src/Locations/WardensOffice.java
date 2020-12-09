package Locations;

public class WardensOffice extends Location{

	public WardensOffice(Outside.Guard warden) {

		this.name = "WardensOffice";
		this.guards.add(warden);
		this.items.add(new Objects.Paperclip());
		this.items.add(new Objects.Computer());
	}
}
