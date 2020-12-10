package Locations;

public class WardensOffice extends Location{

	public WardensOffice()
	{
		super();
		this.name = "WardensOffice";
		this.items.add(new Objects.Paperclip());
		this.items.add(new Objects.Computer());
	}

}
