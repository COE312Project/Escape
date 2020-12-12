package Locations;

public class WardensOffice extends Location{

	public Objects.Computer computer = new Objects.Computer();
	public WardensOffice(Location aLeft)
	{
		super();
		this.name = "WardensOffice";
		this.items.add(new Objects.Paperclip(aLeft));
		this.items.add(computer);
		this.desc = " The warden is at the cafeteria handling the commotion you started. \n"
				+ " You sneak in quietly avoiding any attention to yourself. \n"
				+ " You know you have to get out quick before the warden returns. \n"
				+ "\n\t<< YOU HAVE 2 MINS TO FINISH WHAT YOU CAME FOR! >> \n";
		this.wDesc = " The door you came from leads back to the west corridor. \n";
	}

}
