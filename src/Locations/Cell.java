package Locations;


public class Cell extends Location {
	
	public Cell()
	{
		super();
		this.items.add(new Objects.Bed());
		this.name = "Cell";
		this.desc = "\n On the North wall is a window, your only connection to the outside world."
				+ "\n The solid metal bars on it made you wish you'd spent more time in the gym!";
		this.sDesc = "\n The door to the South leads to the North corridor. ";
	}
	
}
