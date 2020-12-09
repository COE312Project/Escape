package GameCharacters;

import Locations.Location;

public interface State {
	
	public void prev(Context context,Location l);
	public void next(Context context, Location l);
	public void printStatus();

}
