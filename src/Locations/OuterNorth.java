package Locations;

public class OuterNorth extends Location {

	public OuterNorth() {
		super();
		super.isLocked = true;
		this.name = "Outer-North";
		this.desc = "\n You're outside the prison, surrounded by 12-foot high walls.\n Your first breath of fresh air in a long time...";
		this.eDesc = "\n Down the passage to the East, you see a manhole on the ground, with the cover slightly ajar! ";
	}
	
	public void enter()
	{
		super.enter();
		//System.out.println(" Out of nowhere, appears three elite guards");
	}
}
